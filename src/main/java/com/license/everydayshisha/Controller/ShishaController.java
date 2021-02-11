package com.license.everydayshisha.Controller;

import com.license.everydayshisha.Model.DAO.Shisha;
import com.license.everydayshisha.Repository.ShishaRepository;
import com.license.everydayshisha.Service.ShishaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/shishas")
public class ShishaController {

    @Autowired
    private ShishaService shishaService;

    @PostMapping("/addShisha")
    public Shisha addShisha(@RequestBody Shisha shisha) {
        return this.shishaService.addShisha(shisha);
    }

    @GetMapping("/getShisha/{id}")
    public Shisha getShisha(@PathVariable int id) {
        return this.shishaService.getShisha(id);
    }

    @GetMapping("/getAllShishas")
    public List<Shisha> getAllShishas() {
        return this.shishaService.getAllShishas();
    }

    @DeleteMapping("/deleteShisha/{id}")
    public void deleteShisha(@PathVariable int id) {
        this.shishaService.deleteShisha(id);
        System.out.println("Shisha with id " + id + " deleted");
    }

    @PutMapping("/updateShisha/{id}")
    public void updateShisha(@RequestBody Shisha shisha, @PathVariable int id) {
        this.shishaService.updateShisha(shisha, id);
        System.out.println("Shisha with id " + id + " updated");

    }
}
