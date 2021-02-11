package com.license.everydayshisha.Controller;

import com.license.everydayshisha.Model.DAO.Client;
import com.license.everydayshisha.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    //content on the page
    @RequestMapping("/saveClientPage")
    public String showSaveClient(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "saveClientPage";
    }

    //the redirect after pressing save client
    @RequestMapping(value = "/saveClient", method = RequestMethod.POST)
    public String saveClient(@ModelAttribute("client") Client client){
        this.clientService.saveClient(client);
        return "redirect:/clients/clientsManagement";
    }

    @RequestMapping("/clientsManagement")
    public String getAllClients(Model model) {
        List<Client> clients = clientService.getAllClients();
        model.addAttribute("clients", clients);
        return "clientsManagementPage";
    }

    @RequestMapping("/deleteClient/{id}")
    public String deleteClient(@PathVariable(name = "id") int id) {
        this.clientService.deleteClient(id);
        return "redirect:/clients/clientsManagement";
    }

    @RequestMapping("/updateClient/{id}")
    public ModelAndView updateClient(@PathVariable(name = "id") int id) {
        ModelAndView modelAndView = new ModelAndView("updateClientPage");
        Client client = clientService.getClient(id);
        modelAndView.addObject(client);
        return modelAndView;
    }
}
