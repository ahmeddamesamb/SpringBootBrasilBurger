package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "taille")
@Getter
@Setter
@NoArgsConstructor
public class Taille {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taille_id", nullable = false)
    private Long id;
    @Column
    private int prix;
    @Column
    private String libelle;
    @OneToMany(
            mappedBy = "taille",
            orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<MenuTaille> menuTailleList=new ArrayList<>();
    @OneToMany(
            mappedBy = "taille",
            orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<TailleBoisson>tailleBoissons=new ArrayList<>();

}
