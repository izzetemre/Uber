package com.example.Uber.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;
//import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "islem")
public class Islem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long islemId;

    //Long soforId;
    //Long musteriId;
    private Time islemZamani;
    private Long fiyat;

//    @JsonBackReference
//    @ManyToOne
//    Musteri musteri;
//
//    @JsonBackReference
//    @ManyToOne
//    Sofor sofor;




}
