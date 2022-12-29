package com.example.backendnewbresil.controller;

import com.example.backendnewbresil.dto.ProduitDto;
import com.example.backendnewbresil.model.Boisson;
import com.example.backendnewbresil.model.Burger;
import com.example.backendnewbresil.model.Frite;
import com.example.backendnewbresil.model.Produit;
import com.example.backendnewbresil.repository.ProduitRepository;
import com.example.backendnewbresil.service.ProduitService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping( "/api/produit")
public class ProduitController {
    private final ModelMapper modelMapper;
    private final ProduitService produitService;
    private final ProduitRepository produitRepository;


    public ProduitController(ModelMapper modelMapper, ProduitService produitService, ProduitRepository produitRepository) {
        this.modelMapper = modelMapper;
        this.produitRepository = produitRepository;
        this.produitService=produitService;
    }

    @GetMapping("/{type}")
    public List<ProduitDto> getAllProduit(@PathVariable String type) {

        return produitService.getAllProduit().stream().map(produit -> modelMapper.map(produit, ProduitDto.class))
                .collect(Collectors.toList());
    }
    @PostMapping("/{type}")
    public Produit createPost(@RequestBody ProduitDto produitDto , @PathVariable String type) {

        if (type.equalsIgnoreCase("burger"))
        {
            Burger newBurger=new Burger();
            newBurger.setNom(produitDto.getNom());
            newBurger.setImage(produitDto.getImage());
            newBurger.setPrix(produitDto.getPrix());
            newBurger.setDescription(produitDto.getDescription());
            newBurger.setEtatProduit("disponible");

            System.out.println("Burger inserer avec Success");
            return produitRepository.save(newBurger);

        } else if (type.equalsIgnoreCase("frite")) {

            Frite newFrite=new Frite();
            newFrite.setNom(produitDto.getNom());
            newFrite.setImage(produitDto.getImage());
            newFrite.setPrix(produitDto.getPrix());
            newFrite.setDescription(produitDto.getDescription());
            newFrite.setEtatProduit("disponible");
            System.out.println("Frite inserer avec Success");
            return produitRepository.save(newFrite);
        } else {
            Boisson newBoisson=new Boisson();
            newBoisson.setNom(produitDto.getNom());
            newBoisson.setImage(produitDto.getImage());
            newBoisson.setPrix(produitDto.getPrix());
            newBoisson.setDescription(produitDto.getDescription());
            newBoisson.setEtatProduit("disponible");

            System.out.println("Boisson inserer avec Success");
            return produitRepository.save(newBoisson);
        }

    }
}
