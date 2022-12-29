package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "boisson")
@NoArgsConstructor
@Getter
@Setter
public class Boisson extends Produit{
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER,
            mappedBy = "boisson")
    private List<TailleBoisson> tailleBoissonList=new ArrayList<>();
}
