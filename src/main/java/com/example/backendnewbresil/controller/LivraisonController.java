package com.example.backendnewbresil.controller;

import com.example.backendnewbresil.dto.LivraisonDto;
import com.example.backendnewbresil.dto.TailleDto;
import com.example.backendnewbresil.model.Livraison;
import com.example.backendnewbresil.model.Taille;
import com.example.backendnewbresil.repository.LivraisonRepository;
import com.example.backendnewbresil.service.LivraisonService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/livraison")

public class LivraisonController {
    private ModelMapper modelMapper;
    private LivraisonRepository livraisonRepository;
    private LivraisonService livraisonService;

    public LivraisonController(ModelMapper modelMapper, LivraisonRepository livraisonRepository, LivraisonService livraisonService) {
        this.modelMapper = modelMapper;
        this.livraisonRepository = livraisonRepository;
        this.livraisonService = livraisonService;
    }
    @GetMapping("/{type}")
    public List<LivraisonDto> getAllLivraison(@PathVariable String type) {

        return livraisonService.getAllLivraison().stream().map(livraison -> modelMapper.map(livraison, LivraisonDto.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/{type}")
    public Livraison createPost(@RequestBody LivraisonDto livraisonDto, @PathVariable String type) {
        if (type.equalsIgnoreCase("livraison")) {
            Livraison newLivraison = new Livraison();
            newLivraison.setEtatLivraison("en cours");
            newLivraison.setTelephoneLivraison(livraisonDto.getTelephoneLivraison());

            return livraisonRepository.save(newLivraison);
        }
        return null;
    }
}
