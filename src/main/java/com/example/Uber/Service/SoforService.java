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

        return soforRepository.findSoforBySoforId(soforId);
    }

    public void deleteSoforById(Long soforId){

        soforRepository.delete(soforId);
    }

    public void updateSoforById(Long soforId, Sofor newSofor){

        Sofor sofor = findSoforById(soforId);

        //sofor.setSoforId(newSofor.getSoforId());
        sofor.setAd(newSofor.getAd());
        sofor.setSoyad(newSofor.getSoyad());
        sofor.setCinsiyet(newSofor.getCinsiyet());
        sofor.setTelNo(newSofor.getTelNo());
        saveSofor(sofor);
    }

}
