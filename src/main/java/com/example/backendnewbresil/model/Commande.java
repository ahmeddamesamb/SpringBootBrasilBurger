package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "commande")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commande_id", nullable = false)
    private Long id;
    @Column
    private String etatCommande;
    @Column
    private String numeroCommande;
    @Column
    private String dateCommande;
    @Column

    private String statusCommande;
    @Column
    private int paiement;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gestionaire_id")
    private Gestionaire gestionaire;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(
            mappedBy = "commande",
            cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<LigneCommande> ligneCommandes = new ArrayList<>();
    @OneToMany(
            mappedBy = "commande",
            cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<Burger> burgers = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "livraison_livraison_id")
    private Livraison livraison;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "zone_zone_id")
    private Zone zone;
}
