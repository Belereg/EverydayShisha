package com.license.everydayshisha.Controller;

import com.license.everydayshisha.Model.DAO.Client;
import com.license.everydayshisha.Repository.ClientRepository;
import com.license.everydayshisha.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/")
public class ApplicationController {

    //@Autowired
    //private ClientService clientService; aici o sa vina in loc la asta, service-ul mainpage-ului
    @Autowired
    private ClientService clientService;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Client> listClients = clientService.getAllClients();
        model.addAttribute("listClients", listClients);
        return "homePage";
    }

    @RequestMapping("/admin")
    public String viewAdminPage(Model model){
        List<Client> listClients = clientService.getAllClients();
        model.addAttribute("listClients", listClients);
        return "adminPage";
    }

//
//    //test
//    @GetMapping("/getPage")
//    public String page() {
//        return "page_form";
//    }

//    @GetMapping("/")
//    public String home(){
//        return "MainPage";
//    }

//    @GetMapping("/user")
//    public String user(){
//        return ("<h1>Welcome user</h1>");
//    }
//
//    @GetMapping("/admin")
//    public String admin(){
//        return ("<h1>Welcome admin</h1>");
//    }
}
