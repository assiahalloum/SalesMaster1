package com.example.SalesMaster1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Nom;
    private String Description;
    private Double Prix;
    private int QuantitéEnStock;
    @Lob
    private byte[] image;

    @ManyToMany
    @JoinTable(name = "Lignedevente")
    private List<LigneDeVente> Lignedevente=new ArrayList<>();
}
