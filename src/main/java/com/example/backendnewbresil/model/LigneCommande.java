package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ligneCommande")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ligneCommande_id", nullable = false)
    private Long id;
    @Column
    private int quantiteCommande;
    @Column
    private int prixCommande;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "produit_id")
    private Produit produit;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commande_commande_id")
    private Commande commande;


}
