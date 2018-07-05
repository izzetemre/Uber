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
@Table(name = "musteri")
public class Musteri {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long musteriId;

    String ad;
    String soyad;
    char cinsiyet;
    Long telNo;

    @OneToMany(mappedBy = "musteri")
    List<Islem> islemler;

//    @ManyToMany(mappedBy = "musteriler")
//    List<Islem> islemler;
}
