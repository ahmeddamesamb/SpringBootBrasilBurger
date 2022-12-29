package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "client")
public class Client extends Personne{
    @Column
    private String adresse;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gestionaire_id")
    private Gestionaire gestionaire;
    @OneToMany(
            mappedBy = "client",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<Commande> commandes=new ArrayList<>();

}
