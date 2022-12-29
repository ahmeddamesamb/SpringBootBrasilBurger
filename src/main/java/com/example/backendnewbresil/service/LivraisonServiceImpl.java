package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Livraison;
import com.example.backendnewbresil.repository.LivraisonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LivraisonServiceImpl implements LivraisonService{
    private final LivraisonRepository livraisonRepository;

    public LivraisonServiceImpl(LivraisonRepository livraisonRepository) {
        this.livraisonRepository = livraisonRepository;
    }

    @Override
    public List<Livraison> getAllLivraison() {
        return livraisonRepository.findAll();
    }

    @Override
    public Livraison createLivraison(Livraison livraison) {
        return livraisonRepository.save(livraison);
    }

    @Override
    public Livraison updateLivraison(long id, Livraison livraison) {
        return null;
    }

    @Override
    public void deleteLivraison(long id) {

    }

    @Override
    public Livraison getLivraisonById(long id) {
        return null;
    }
}
