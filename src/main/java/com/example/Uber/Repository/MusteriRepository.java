package com.example.Uber.Repository;

import com.example.Uber.Entity.Musteri;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

//@Repository
public interface MusteriRepository extends CrudRepository<Musteri,Long> {

    List<Musteri> findAll();

    Musteri findMusteriByMusteriId(@Param("musteriId") Long musteriId);


}
