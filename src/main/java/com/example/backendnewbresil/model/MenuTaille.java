package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "menuTaille")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MenuTaille {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menuTaille_id", nullable = false)
    private Long id;
    @Column
    private int quantiteTaille;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "menu_id")
    private Menu menu;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "taille_taille_id")
    private Taille taille;

}
