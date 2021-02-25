package com.license.everydayshisha.Controller;

import com.license.everydayshisha.Model.DAO.Flavour;
import com.license.everydayshisha.Service.FlavourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/flavours")
public class FlavourController {

    @Autowired
    private FlavourService flavourService;

    //content on the page
    @RequestMapping("/saveFlavourPage")
    public String showSaveFlavour(Model model) {
        Flavour flavour = new Flavour();
        model.addAttribute("flavour", flavour);
        return "saveFlavourPage";
    }

    //the redirect after pressing save flavour
    @RequestMapping(value = "/saveFlavour", method = RequestMethod.POST)
    public String saveFlavour(@Valid @ModelAttribute("flavour") Flavour flavour, BindingResult bindingResult){

        if (bindingResult.hasErrors())
        {
            return "saveFlavourPage";
        }
        this.flavourService.saveFlavour(flavour);
        return "redirect:/flavours/flavoursManagement";
    }

    @RequestMapping("/flavoursManagement")
    public String getAllFlavours(Model model) {
        List<Flavour> flavours = flavourService.getAllFlavours();
        model.addAttribute("flavours", flavours);
        return "flavoursManagementPage";
    }

    @RequestMapping("/deleteFlavour/{id}")
    public String deleteFlavour(@PathVariable(name = "id") int id) {
        this.flavourService.deleteFlavour(id);
        return "redirect:/flavours/flavoursManagement";
    }

    @RequestMapping("/updateFlavour/{id}")
    public ModelAndView updateFlavour(@PathVariable(name = "id") int id) {
        ModelAndView modelAndView = new ModelAndView("updateFlavourPage");
        Flavour flavour = flavourService.getFlavour(id);
        modelAndView.addObject(flavour);
        return modelAndView;
    }
}
