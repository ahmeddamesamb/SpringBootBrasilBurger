package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "gestionaire")
public class Gestionaire extends Personne{
    @OneToMany(
            mappedBy = "gestionaire",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<Client> clients=new ArrayList<>();
    @OneToMany(
            mappedBy = "gestionaire",
            cascade = CascadeType.ALL,
            orphanRemoval = true,fetch = FetchType.EAGER
    )
    private List<Livreur> livreurs=new ArrayList<>();
    @OneToMany(
            mappedBy = "gestionaire",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<Livraison>livraisons=new ArrayList<>();
    @OneToMany(
            mappedBy = "gestionaire",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<Commande>commandes=new ArrayList<>();
    @OneToMany(
            mappedBy = "gestionaire",
            orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Produit>produits =new ArrayList<>();
    @OneToMany(
            mappedBy = "gestionaire",
            orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Zone>zones=new ArrayList<>();


}
