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
    Long arabaId;

    String plaka;
    String marka;
    String model;
    char sınıf;

    @OneToOne
    Sofor sofor;
}
