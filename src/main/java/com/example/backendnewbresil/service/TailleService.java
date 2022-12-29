package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Taille;

import java.util.List;

public interface TailleService {
    List<Taille> getAllTaille();

    Taille createTaille(Taille taille);

    Taille updateTaille(long id, Taille taille);

    void deleteTaille(long id);

    Taille getTailleById(long id);
}
