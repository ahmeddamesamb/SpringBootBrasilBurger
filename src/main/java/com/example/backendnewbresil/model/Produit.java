package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produit")
@Inheritance(strategy = InheritanceType.JOINED)
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;
    @Column
    protected String nom;
    @Column
    protected String description;
    @Column
    protected String image;
    @Column
    protected int prix;
    @Column(name = "etat_produit")
    protected String etatProduit;
    @OneToMany(
            mappedBy = "produit",
            orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<LigneCommande>ligneCommandes=new ArrayList<>();


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gestionaire_id")
    private Gestionaire gestionaire;


}
