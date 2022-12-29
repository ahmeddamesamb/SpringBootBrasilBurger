package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "menuBurger")
@NoArgsConstructor
@Getter
@Setter
public class MenuBurger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menuBurger_id", nullable = false)
    private Long id;
    @Column

    private int quantiteBurger;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "burger_id")
    private Burger burger;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "menu_id")
    private Menu menu;
}
