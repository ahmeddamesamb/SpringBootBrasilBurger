package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Commande;

import java.util.List;

public interface CommandeService {
    List<Commande> getAllCommande();

    Commande createCommande(Commande commande);

    Commande updateCommande(long id, Commande commande);

    void deleteCommande(long id);

    Commande getCommandeById(long id);
}
