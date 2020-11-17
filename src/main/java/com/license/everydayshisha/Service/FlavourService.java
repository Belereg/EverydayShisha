package com.license.everydayshisha.Service;

import com.license.everydayshisha.Model.DAO.Flavour;
import com.license.everydayshisha.Repository.FlavourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlavourService {

    @Autowired
    private FlavourRepository flavourRepository;

    public Flavour addFlavour(Flavour flavour) {
        return this.flavourRepository.save(flavour);
    }

    public Flavour getFlavour(int id) {
        return this.flavourRepository.findById(id).get();
    }

    public List<Flavour> getAllFlavours() {
        return this.flavourRepository.findAll();
    }

    public void deleteFlavour(int id){
        this.flavourRepository.deleteById(id);
    }

    public void updateFlavour(Flavour flavour, int id){
        Flavour updatedFlavour = this.flavourRepository.findById(id).get();

        updatedFlavour.setAmount(flavour.getAmount());
        updatedFlavour.setFlavourName(flavour.getFlavourName());

        flavourRepository.save(updatedFlavour);
    }
}
