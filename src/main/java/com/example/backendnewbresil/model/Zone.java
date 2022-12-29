package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zone")
@Getter
@Setter
public class Zone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zone_id", nullable = false)
    private Long id;
    @Column
    private String nomZone;
    @Column
    private String etatZone;
    @Column
    private int coutLivraison;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gestionaire_id")
    private Gestionaire gestionaire;
    @OneToMany(
            mappedBy = "zone",
            orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Commande> commandes=new ArrayList<>();



}
