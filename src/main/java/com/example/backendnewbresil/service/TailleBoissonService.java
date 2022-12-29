package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.TailleBoisson;

import java.util.List;

public interface TailleBoissonService {
    List<TailleBoisson> getAllTailleBoisson();

    TailleBoisson createTailleBoisson(TailleBoisson tailleBoisson);

    TailleBoisson updateTailleBoisson(long id, TailleBoisson tailleBoisson);

    void deleteTailleBoisson(long id);

    TailleBoisson getTailleBoissonById(long id);
}
