package com.example.SalesMaster1.repositories;

import com.example.SalesMaster1.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenteRepository extends JpaRepository<Vente,Long> {
}
