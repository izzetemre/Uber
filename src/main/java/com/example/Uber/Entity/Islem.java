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
@Table(name = "islem")
public class Islem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long islemId;

    //Long soforId;
    //Long musteriId;
    String islemZamani;
    Long fiyat;

    @ManyToOne
    @JoinColumn(name = "musteri")
    Musteri musteri;

    @ManyToOne
    @JoinColumn(name = "sofor")
    Sofor sofor;

//    @ManyToMany
//    @JoinTable(name = "islem_musteri",
//            joinColumns = { @JoinColumn(name = "fk_islem") },
//            inverseJoinColumns = { @JoinColumn(name = "fk_musteri") })
//    List<Sofor> musteriler;

//    @ManyToMany
//    @JoinTable(name = "islem_sofor",
//            joinColumns = { @JoinColumn(name = "fk_islem") },
//            inverseJoinColumns = { @JoinColumn(name = "fk_sofor") })
//    List<Musteri> sofor;


}
