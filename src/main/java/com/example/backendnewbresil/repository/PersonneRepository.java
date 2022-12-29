package com.example.backendnewbresil.repository;

import com.example.backendnewbresil.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
