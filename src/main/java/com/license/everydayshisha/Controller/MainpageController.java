package com.license.everydayshisha.Controller;

import com.license.everydayshisha.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainpageController {

    //@Autowired
    //private ClientService clientService; aici o sa vina in loc la asta, service-ul mainpage-ului


    //test
    @GetMapping("/getPage")
    public String page() {
        return ("<h1>Just a normal Page</h1>");
    }

    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome Everyone</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome user</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome admin</h1>");
    }

}
