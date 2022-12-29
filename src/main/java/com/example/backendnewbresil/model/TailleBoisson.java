package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tailleBoisson")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TailleBoisson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taiileBoisson_id", nullable = false)
    private Long id;
    @Column
    private int quantiteStock;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "boisson_boisson_id")
    private Boisson boisson;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "taille_taille_id")
    private Taille taille;
}
