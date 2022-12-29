package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Livraison;

import java.util.List;

public interface LivraisonService {
    List<Livraison> getAllLivraison();

    Livraison createLivraison(Livraison livraison);

    Livraison updateLivraison(long id, Livraison livraison);

    void deleteLivraison(long id);

    Livraison getLivraisonById(long id);
}
