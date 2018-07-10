package com.example.Uber.Service;

import com.example.Uber.Entity.Kart;
import com.example.Uber.Repository.KartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KartService {
    @Autowired
    KartRepository kartRepository;


    public List<Kart> findKartAll(){

        return kartRepository.findAll();
    }

    public void saveKart(Kart kart){

        kartRepository.save(kart);
    }

    public Kart findKartById(Long kartId){

        //return kartRepository.findKartByKartId(kartId);
        return kartRepository.findOne(kartId);
    }

    public void deleteKartById(Long kartId){

        kartRepository.delete(kartId);
    }

    public void updateKartById(Long kartId, Kart newKart){

        if (kartId.equals(newKart.getKartId())){

            saveKart(newKart);
        }
    }

}