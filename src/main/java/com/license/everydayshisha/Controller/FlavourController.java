package com.license.everydayshisha.Controller;

import com.license.everydayshisha.Model.DAO.Client;
import com.license.everydayshisha.Model.DAO.Flavour;
import com.license.everydayshisha.Service.FlavourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flavours")
public class FlavourController {

    @Autowired
    private FlavourService flavourService;

    @PostMapping("/addFlavour")
    public Flavour addFlavour(@RequestBody Flavour flavour) {
        return this.flavourService.addFlavour(flavour);
    }

    @GetMapping("/getFlavour/{id}")
    public Flavour getFlavour(@PathVariable int id) {
        return this.flavourService.getFlavour(id);
    }

    @GetMapping("/getAllFlavours")
    public List<Flavour> getAllFlavours() {
        return this.flavourService.getAllFlavours();
    }

    @DeleteMapping("/deleteFlavour/{id}")
    public void deleteFlavour(@PathVariable int id) {
        this.flavourService.deleteFlavour(id);
        System.out.println("Flavour with id " + id + " deleted");
    }

    @PutMapping("/updateFlavour/{id}")
    public void updateFlavour(@RequestBody Flavour flavour, @PathVariable int id) {
        this.flavourService.updateFlavour(flavour, id);
        System.out.println("Flavour with id " + id + " updated");
    }
}
