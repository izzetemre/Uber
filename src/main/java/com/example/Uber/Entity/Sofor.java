package com.example.Uber.Entity;

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
    Long soforId;

    String ad;
    String soyad;
    char cinsiyet;
    Long telNo;

    @OneToOne
    Araba araba;

    @ManyToMany
    List<Musteri> musteri;

}
