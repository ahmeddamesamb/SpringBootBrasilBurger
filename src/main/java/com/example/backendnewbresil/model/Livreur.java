package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "livreur")
@NoArgsConstructor
@Data
public class Livreur extends Personne{
    @Column
    private String matriculeMoto;
    @Column
    private String etatLivreur;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gestionaire_id")
    private Gestionaire gestionaire;
    @OneToMany(
            mappedBy = "livreur",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<Livraison> livraisons=new ArrayList<>();
}
