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
@Table(name = "kart")
public class Kart {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long kartId;

    private String bankaAdi;
    private Long bakiye;


    @ManyToOne
    @JoinColumn(name = "musteri")
    private Musteri musteri;

    @JsonBackReference
    @OneToMany(mappedBy = "kart")
    private List<Islem> islemler;
}
