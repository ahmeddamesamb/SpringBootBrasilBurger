package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Personne;

import java.util.List;

public interface PersonneService {
    List<Personne> getAllPersonne();

    Personne createPersonne(Personne personne);

    Personne updatePersonne(long id, Personne personne);

    void deletePersonne(long id);

    Personne getPersonneById(long id);
}
