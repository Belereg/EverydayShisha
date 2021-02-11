package com.license.everydayshisha.Service;

import com.license.everydayshisha.Model.DAO.Flavour;
import com.license.everydayshisha.Repository.FlavourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class FlavourService {

    @Autowired
    private FlavourRepository flavourRepository;

    public void saveFlavour(Flavour flavour) {
        flavourRepository.save(flavour);
    }

    public Flavour getFlavour(int id) {
        return this.flavourRepository.findById(id).get();
    }

    public List<Flavour> getAllFlavours() {
        List<Flavour> flavourList = this.flavourRepository.findAll();
        flavourList.sort(new sortByFlavourId());
        return flavourList;
    }

    public void deleteFlavour(int id){
        this.flavourRepository.deleteById(id);
    }

//    public void updateFlavour(Flavour flavour, int id){
//        Flavour updatedFlavour = this.flavourRepository.findById(id).get();
//
//        updatedFlavour.setAmount(flavour.getAmount());
//        updatedFlavour.setFlavourName(flavour.getFlavourName());
//
//        flavourRepository.save(updatedFlavour);
//    }
}

class sortByFlavourId implements Comparator<Flavour>
{
    public int compare(Flavour a, Flavour b)
    {
        return a.getIdFlavour() - b.getIdFlavour();
    }
}
