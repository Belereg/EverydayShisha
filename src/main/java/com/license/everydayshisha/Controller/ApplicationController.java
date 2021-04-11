package com.license.everydayshisha.Controller;

import com.license.everydayshisha.Model.DAO.Client;
import com.license.everydayshisha.Model.DAO.Shisha;
import com.license.everydayshisha.Service.ClientService;
import com.license.everydayshisha.Service.ShishaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ApplicationController {

    //@Autowired
    //private ClientService clientService; aici o sa vina in loc la asta, service-ul mainpage-ului
    @Autowired
    private ClientService clientService;

    @Autowired
    private ShishaService shishaService;


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

    @RequestMapping("/offers")
    public String viewOffersPage(Model model){
        List<Client> listClients = clientService.getAllClients();
        List<Shisha> listShishas = shishaService.getAllShishas();
        model.addAttribute("listClients", listClients);
        model.addAttribute("listShishas", listShishas);
        return "offersPage";
    }

    @RequestMapping("/contact")
    public String viewContactPage(Model model){
        List<Client> listClients = clientService.getAllClients();
        List<Shisha> listShishas = shishaService.getAllShishas();
        model.addAttribute("listClients", listClients);
        model.addAttribute("listShishas", listShishas);
        return "contactPage";
    }

    @RequestMapping("/about")
    public String viewAboutPage(){
        return "aboutPage";
    }

    @RequestMapping("/gallery")
    public String viewGalleryPage(){
        return "galleryPage";
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
