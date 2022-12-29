package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "frite")
@NoArgsConstructor
@Getter
@Setter
public class Frite extends Produit{
    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "frite",
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<MenuFrite> menuFrites=new ArrayList<>();
}
