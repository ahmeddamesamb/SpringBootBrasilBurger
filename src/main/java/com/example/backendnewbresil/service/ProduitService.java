package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Produit;

import java.util.List;

public interface ProduitService {

    List<Produit> getAllProduit();

    Produit createProduit(Produit produit);

    Produit updateProduit(long id, Produit produit);

    void deleteProduit(long id);

    Produit getProduitById(long id);
}
