package com.example.backendnewbresil.controller;

import com.example.backendnewbresil.dto.TailleDto;
import com.example.backendnewbresil.model.Taille;
import com.example.backendnewbresil.repository.TailleRepository;
import com.example.backendnewbresil.service.TailleService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/taille")
public class TailleController {

    private final ModelMapper modelMapper;

    private final TailleRepository tailleRepository;
    private final TailleService tailleService;

    public TailleController(ModelMapper modelMapper, TailleRepository tailleRepository, TailleService tailleService) {
        this.modelMapper = modelMapper;
        this.tailleRepository = tailleRepository;
        this.tailleService = tailleService;
    }

    @GetMapping("/{type}")
    public List<TailleDto> getAllTaille(@PathVariable String type) {

        return tailleService.getAllTaille().stream().map(taille -> modelMapper.map(taille, TailleDto.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/{type}")
    public Taille createPost(@RequestBody TailleDto tailleDto, @PathVariable String type) {
        if (type.equalsIgnoreCase("taille")) {
            Taille newTaille = new Taille();
            newTaille.setPrix(tailleDto.getPrix());
            newTaille.setLibelle(tailleDto.getLibelle());

            return tailleRepository.save(newTaille);
        }
        return null;
    }
}
