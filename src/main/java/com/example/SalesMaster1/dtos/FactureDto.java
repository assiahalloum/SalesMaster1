package com.example.SalesMaster1.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FactureDto {
    private Long id;
    private Date dateFacturation;
    private Double montantTotal;
    private String statutPaiement;
    private byte[] pdf;
}
