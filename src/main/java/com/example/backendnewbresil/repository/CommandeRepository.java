package com.example.backendnewbresil.repository;

import com.example.backendnewbresil.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
