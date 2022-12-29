package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.TailleBoisson;
import com.example.backendnewbresil.repository.TailleBoissonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class TailleBoissonImpl implements TailleBoissonService{
    private final TailleBoissonRepository tailleBoissonRepository;

    public TailleBoissonImpl(TailleBoissonRepository tailleBoissonRepository) {
        this.tailleBoissonRepository = tailleBoissonRepository;
    }

    @Override
    public List<TailleBoisson> getAllTailleBoisson() {
        return tailleBoissonRepository.findAll();
    }

    @Override
    public TailleBoisson createTailleBoisson(TailleBoisson tailleBoisson) {
        return tailleBoissonRepository.save(tailleBoisson);
    }

    @Override
    public TailleBoisson updateTailleBoisson(long id, TailleBoisson tailleBoisson) {
        return null;
    }

    @Override
    public void deleteTailleBoisson(long id) {

    }

    @Override
    public TailleBoisson getTailleBoissonById(long id) {
        return null;
    }
}
