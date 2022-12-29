package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Produit;
import com.example.backendnewbresil.repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitServiceImpl implements ProduitService{
    private final ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        super();
        this.produitRepository = produitRepository;
    }

    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }

    @Override
    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(long id, Produit produit) {
        return null;
    }

    @Override
    public void deleteProduit(long id) {

    }

    @Override
    public Produit getProduitById(long id) {
        return null;
    }
}
