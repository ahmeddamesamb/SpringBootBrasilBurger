package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.Taille;
import com.example.backendnewbresil.repository.TailleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TailleServiceImpl implements TailleService{
    private final TailleRepository tailleRepository;

    public TailleServiceImpl(TailleRepository tailleRepository) {
        super();
        this.tailleRepository = tailleRepository;
    }

    @Override
    public List<Taille> getAllTaille() {
        return tailleRepository.findAll();
    }

    @Override
    public Taille createTaille(Taille taille) {
        return tailleRepository.save(taille);
    }

    @Override
    public Taille updateTaille(long id, Taille taille) {
        return null;
    }

    @Override
    public void deleteTaille(long id) {

    }

    @Override
    public Taille getTailleById(long id) {
        return null;
    }
}
