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
@Table(name = "musteri")
public class Musteri {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long musteriId;

    private String ad;
    private String soyad;
    private char cinsiyet;
    private Long telNo;

    @JsonBackReference
    @OneToMany(mappedBy = "musteri")
    private List<Kart> kartlar;




}