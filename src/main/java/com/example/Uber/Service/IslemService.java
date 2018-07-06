package com.example.Uber.Service;

import com.example.Uber.Entity.Islem;
import com.example.Uber.Repository.IslemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IslemService {
    @Autowired
    IslemRepository islemRepository;


    public List<Islem> findIslemAll(){

        return islemRepository.findAll();
    }

    public void saveIslem(Islem islem){

        islemRepository.save(islem);
    }

    public Islem findIslemById(Long islemId){

        //return islemRepository.findIslemByIslemId(islemId);
        return islemRepository.findOne(islemId);
    }

    public void deleteIslemById(Long islemId){

        islemRepository.delete(islemId);
    }

    public void updateIslemById(Long islemId, Islem newIslem){

        if (islemId.equals(newIslem.getIslemId())){

            saveIslem(newIslem);
        }
    }

}
