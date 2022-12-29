package com.example.backendnewbresil.repository;

import com.example.backendnewbresil.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
