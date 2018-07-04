package com.example.Uber.Repository;

import com.example.Uber.Entity.Sofor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

//@Repository
public interface SoforRepository extends CrudRepository<Sofor,Long> {

    List<Sofor> findAll();

    Sofor findSoforBySoforId(@Param("soforId") Long soforId);


}
