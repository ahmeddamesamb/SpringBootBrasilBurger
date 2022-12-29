package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "burger")
@NoArgsConstructor
@Getter
@Setter
public class Burger extends Produit{
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "commande_id")
    private Commande commande;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER,
            mappedBy = "burger"
    )
    private List<MenuBurger> menuBurgers=new ArrayList<>();
}
