package com.license.everydayshisha.Service;

import com.license.everydayshisha.Model.DAO.Client;
import com.license.everydayshisha.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void addClient(Client client) {
        clientRepository.save(client);
    }
    
    public Client getClient(int id) {
        return this.clientRepository.findById(id).get();
    }

    public List<Client> getAllClients() {
        return this.clientRepository.findAll();
    }

    public void deleteClient(int id){
        this.clientRepository.deleteById(id);
    }
//
//    public void updateClient(Client client, int id){
//        Client updatedClient = this.clientRepository.findById(id).get();
//
//        updatedClient.setAddress(client.getAddress());
//        updatedClient.setCNP(client.getCNP());
//        updatedClient.setFirstName(client.getFirstName());
//        updatedClient.setLastName(client.getLastName());
//        updatedClient.setPhoneNumber(client.getPhoneNumber());
//
//        clientRepository.save(updatedClient);
//    }
}
















