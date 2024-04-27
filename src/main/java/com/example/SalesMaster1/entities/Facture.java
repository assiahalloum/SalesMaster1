package com.example.SalesMaster1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int Id;
    private Date DateFacturation;
    private Double MontantTotal;
    private String StatutPaiement;
    @Lob
    private byte[] PDF;

    @OneToOne
    @JoinColumn(name = "Vente_Id")
    private Vente vente;


}