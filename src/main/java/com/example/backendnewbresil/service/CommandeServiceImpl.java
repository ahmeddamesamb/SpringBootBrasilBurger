package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Commande;
import com.example.backendnewbresil.repository.CommandeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService{
    private final CommandeRepository commandeRepository;

    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public List<Commande> getAllCommande() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande createCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande updateCommande(long id, Commande commande) {
        return null;
    }

    @Override
    public void deleteCommande(long id) {

    }

    @Override
    public Commande getCommandeById(long id) {
        return null;
    }
}
