package com.example.Uber.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
//import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sofor")
public class Sofor {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long soforId;

    private String ad;
    private String soyad;
    private char cinsiyet;
    private Long telNo;

    //@JsonBackReference
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    Araba araba;
//
//    @OneToMany(mappedBy = "sofor")
//    List<Islem> islemler;




}
