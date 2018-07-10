package com.example.Uber.Repository;

import com.example.Uber.Entity.Kart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//@Repository
public interface KartRepository extends CrudRepository<Kart,Long> {

    List<Kart> findAll();

    //Kart findKartByKartId(@Param("kartId") Long kartId);



}