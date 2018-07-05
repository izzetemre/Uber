package com.example.Uber.Repository;

import com.example.Uber.Entity.Araba;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

//@Repository
public interface ArabaRepository extends CrudRepository<Araba,Long> {

    List<Araba> findAll();

    Araba findArabaByArabaId(@Param("arabaId") Long arabaId);


}
