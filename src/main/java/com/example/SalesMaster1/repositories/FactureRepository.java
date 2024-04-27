package com.example.SalesMaster1.repositories;


import com.example.SalesMaster1.entities.LigneDeVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FactureRepository extends JpaRepository<LigneDeVente,Long> {
}