package com.example.backendnewbresil.dto;

import com.example.backendnewbresil.model.Burger;
import com.example.backendnewbresil.model.Commande;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CommandeDto implements Serializable {
    private Long id;
    private String etatCommande;
    private String numeroCommande;
    private String dateCommande;
    private String statusCommande;
    private int paiement;
    private Long zoneId;
    private Long gestionaireId;
    private Long clientId;
    private Long livraisonId;
    private List<Commande> commandes;
    private List<Burger> burgers;


}
