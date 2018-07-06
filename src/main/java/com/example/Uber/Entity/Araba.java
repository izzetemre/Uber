package com.example.Uber.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "araba")
public class Araba {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long arabaId;

    private String plaka;
    private String marka;
    private String model;
    private String sinif;

    @OneToOne(mappedBy = "araba")
    Sofor sofor;
}
