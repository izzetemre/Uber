package com.example.Uber.Service;

import com.example.Uber.Entity.Sofor;
import com.example.Uber.Repository.SoforRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoforService {
    @Autowired
    SoforRepository soforRepository;


    public List<Sofor> findSoforAll(){

        return soforRepository.findAll();
    }


    public void saveSofor(Sofor sofor){

        soforRepository.save(sofor);
    }

    public Sofor findSoforById(Long soforId){

//        return soforRepository.findSoforBySoforId(soforId);
        return soforRepository.findOne(soforId);
    }

    public void deleteSofor(Sofor sofor){

        soforRepository.delete(sofor);
    }

    public void updateSoforById(Long soforId, Sofor newSofor){
        ;

        if (soforId.equals(newSofor.getSoforId())){

            saveSofor(newSofor);
        }

    }

}