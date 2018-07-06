package com.example.Uber.Repository;

import com.example.Uber.Entity.Islem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

//@Repository
public interface IslemRepository extends CrudRepository<Islem,Long> {

    List<Islem> findAll();

    //Islem findIslemByIslemId(@Param("islemId") Long islemId);


}
