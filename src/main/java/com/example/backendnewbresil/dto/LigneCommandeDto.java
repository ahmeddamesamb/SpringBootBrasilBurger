package com.example.backendnewbresil.dto;

import lombok.Data;

@Data
public class LigneCommandeDto {
    private Long id;
    private int quantiteCommande;
    private int prixCommande;

}
