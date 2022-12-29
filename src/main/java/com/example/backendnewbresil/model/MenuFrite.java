package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "menuFrite")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MenuFrite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menuFrite_id", nullable = false)
    private Long id;
    @Column
    private int quantiteFrite;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "frite_id")
    private Frite frite;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "menu_id")
    private Menu menu;

}
