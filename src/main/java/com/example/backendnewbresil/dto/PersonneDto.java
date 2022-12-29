package com.example.backendnewbresil.dto;
import lombok.Data;

@Data
public class PersonneDto {
    protected Long id;
    protected String email;
    protected String password;
    protected String nom;
    protected String prenom;
    protected String telephone;
    protected String role;
    private String adresse;
    private String matriculeMoto;
    private String etatLivreur;

}
