package com.example.Uber.Service;

import com.example.Uber.Entity.Musteri;
import com.example.Uber.Repository.MusteriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusteriService {
    @Autowired
    MusteriRepository musteriRepository;


    public List<Musteri> findMusteriAll(){

        return musteriRepository.findAll();
    }

    public void saveMusteri(Musteri musteri){

        musteriRepository.save(musteri);
    }

    public Musteri findMusteriById(Long musteriId){

        //return musteriRepository.findMusteriByMusteriId(musteriId);
        return musteriRepository.findOne(musteriId);
    }

    public void deleteMusteriById(Long musteriId){

        musteriRepository.delete(musteriId);
    }

    public void updateMusteriById(Long musteriId, Musteri newMusteri){



        if (musteriId.equals(newMusteri.getMusteriId())){

            saveMusteri(newMusteri);
        }
    }

}
