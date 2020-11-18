package com.license.everydayshisha.Service;

import com.license.everydayshisha.Model.DAO.Shisha;
import com.license.everydayshisha.Repository.ShishaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShishaService {

    @Autowired
    private ShishaRepository shishaRepository;

    public Shisha addShisha(Shisha shisha) {
        return this.shishaRepository.save(shisha);
    }

    public Shisha getShisha(int id) {
        return this.shishaRepository.findById(id).get();
    }

    public List<Shisha> getAllShishas() {
        return this.shishaRepository.findAll();
    }

    public void deleteShisha(int id){
        this.shishaRepository.deleteById(id);
    }

    public void updateShisha(Shisha shisha, int id){
        Shisha updatedShisha = this.shishaRepository.findById(id).get();

        updatedShisha.setShishaName(shisha.getShishaName());
        updatedShisha.setHoseCount(shisha.getHoseCount());
        updatedShisha.setSize(shisha.getSize());

        shishaRepository.save(updatedShisha);
    }
}
