package com.license.everydayshisha.Controller;

import com.license.everydayshisha.Model.DAO.Shisha;
import com.license.everydayshisha.Service.ShishaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/shishas")
public class ShishaController {

    @Autowired
    private ShishaService shishaService;

    //content on the page
    @RequestMapping("/saveShishaPage")
    public String showSaveShisha(Model model) {
        Shisha shisha = new Shisha();
        model.addAttribute("shisha", shisha);
        return "saveShishaPage";
    }

    //the redirect after pressing save shisha
    @RequestMapping(value = "/saveShisha", method = RequestMethod.POST)
    public String saveShisha(@Valid @ModelAttribute("shisha") Shisha shisha, BindingResult bindingResult){

        if (bindingResult.hasErrors())
        {
            return "saveShishaPage";
        }
        this.shishaService.saveShisha(shisha);
        return "redirect:/shishas/shishasManagement";
    }

    @RequestMapping("/shishasManagement")
    public String getAllFlavours(Model model) {
        List<Shisha> shishas = shishaService.getAllShishas();
        model.addAttribute("shishas", shishas);
        return "shishasManagementPage";
    }

    @RequestMapping("/deleteShisha/{id}")
    public String deleteFlavour(@PathVariable(name = "id") int id) {
        this.shishaService.deleteShisha(id);
        return "redirect:/shishas/shishasManagement";
    }

    @RequestMapping("/updateShisha/{id}")
    public ModelAndView updateShishas(@PathVariable(name = "id") int id) {
        ModelAndView modelAndView = new ModelAndView("updateShishaPage");
        Shisha shishas = shishaService.getShisha(id);
        modelAndView.addObject(shishas);
        return modelAndView;
    }
}
