package com.example.Uber.Service;

import com.example.Uber.Entity.Araba;
import com.example.Uber.Repository.ArabaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArabaService {
    @Autowired
    ArabaRepository arabaRepository;


    public List<Araba> findArabaAll(){

        return arabaRepository.findAll();
    }

    public void saveAraba(Araba araba){

        arabaRepository.save(araba);
    }

    public Araba findArabaById(Long arabaId){

        return arabaRepository.findArabaByArabaId(arabaId);
    }

    public void deleteArabaById(Long arabaId){

        arabaRepository.delete(arabaId);
    }

    public void updateArabaById(Long arabaId, Araba newAraba){

        Araba araba = findArabaById(arabaId);

        //araba.setArabaId(newAraba.getArabaId());
        araba.setPlaka(newAraba.getPlaka());
        araba.setMarka(newAraba.getMarka());
        araba.setModel(newAraba.getModel());
        araba.setSınıf(newAraba.getSınıf());
        saveAraba(araba);
    }

}
