package com.example.SalesMaster1.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDto {
    private Long id;
    private String nom;
    private String adresse;
    private String email;
    private int telephone;
    private String historiqueAchats;
}
