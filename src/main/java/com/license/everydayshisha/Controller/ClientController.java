package com.license.everydayshisha.Controller;

import com.license.everydayshisha.Model.DAO.Client;
import com.license.everydayshisha.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return this.clientService.addClient(client);
    }

    @GetMapping("/getClient/{id}")
    public Client getClient(@PathVariable int id) {
        return this.clientService.getClient(id);
    }

    @GetMapping("/getAllClients")
    public List<Client> getAllClients() {
        return this.clientService.getAllClients();
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
