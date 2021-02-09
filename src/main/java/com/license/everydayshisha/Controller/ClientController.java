package com.license.everydayshisha.Controller;

import com.license.everydayshisha.Model.DAO.Client;
import com.license.everydayshisha.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

//    @PostMapping("/addClient")
//    public Client addClient(@RequestBody Client client) {
//        return this.clientService.addClient(client);
//    }

    @RequestMapping("/addClientPage")
    public String addClient2(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "addClientPage";
    }

    @RequestMapping(value = "/addClient", method = RequestMethod.POST)
    public String addClient(@ModelAttribute("client") Client client){
        this.clientService.addClient(client);
        return "redirect:/clients/clientsManagement";
    }

    @GetMapping("/getClient/{id}")
    public Client getClient(@PathVariable int id) {
        return this.clientService.getClient(id);
    }

    @RequestMapping("/clientsManagement")
    public String getAllClients(Model model) {
        List<Client> clients = clientService.getAllClients();
        model.addAttribute("clients", clients);
        return "clientsManagementPage";
    }

    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable int id) {
        this.clientService.deleteClient(id);
        System.out.println("Client with id " + id + " deleted");
    }

    @PutMapping("/updateClient/{id}")
    public void updateClient(@RequestBody Client client, @PathVariable int id) {
        this.clientService.updateClient(client, id);
        System.out.println("Client with id " + id + " updated");
    }
}
