package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "livraison")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "livraison_id", nullable = false)
    private Long id;
    @Column
    private String telephoneLivraison;
    @Column
    private String etatLivraison;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gestionaire_id")
    private Gestionaire gestionaire;
    @OneToMany(
            mappedBy = "livraison",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<Commande> commandes=new ArrayList<>();


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "livreur_id")
    private Livreur livreur;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "zone_zone_id")
    private Zone zone;

}
