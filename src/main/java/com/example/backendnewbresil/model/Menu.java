package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "menu")
@NoArgsConstructor
@Getter
@Setter
public class Menu extends Produit{
    @OneToMany(
            mappedBy = "menu",
            orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<MenuFrite> menuFrites=new ArrayList<>();
    @OneToMany(
            mappedBy = "menu",
            orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<MenuBurger>menuBurgers=new ArrayList<>();
    @OneToMany(
            mappedBy = "menu",
            orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<MenuTaille>menuTailles=new ArrayList<>();

}
