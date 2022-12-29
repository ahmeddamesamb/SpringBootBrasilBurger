package com.example.backendnewbresil.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)

public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column
    protected String email;
    @Column
    protected String password;
    @Column
    protected String nom;
    @Column
    protected String prenom;
    @Column
    protected String telephone;
    @Column
    protected String role;
}
