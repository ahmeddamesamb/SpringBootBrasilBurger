package com.example.backendnewbresil.controller;

import com.example.backendnewbresil.dto.CommandeDto;
import com.example.backendnewbresil.model.Commande;
import com.example.backendnewbresil.repository.CommandeRepository;
import com.example.backendnewbresil.repository.ZoneRepository;
import com.example.backendnewbresil.service.CommandeService;
import com.example.backendnewbresil.service.mapper.MapstructMapper;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/commande")
public class CommandeController {
    private ModelMapper modelMapper;
    private CommandeRepository commandeRepository;
    private ZoneRepository zoneRepository;
    private CommandeService commandeService;
    private MapstructMapper commandeMapper;

    public CommandeController(ModelMapper modelMapper, CommandeRepository commandeRepository, ZoneRepository zoneRepository, CommandeService commandeService, MapstructMapper commandeMapper) {
        this.modelMapper = modelMapper;
        this.commandeRepository = commandeRepository;
        this.zoneRepository = zoneRepository;
        this.commandeService = commandeService;
        this.commandeMapper = commandeMapper;
    }

    @GetMapping("/{type}")
    public List<CommandeDto> getAllCommande(@PathVariable String type) {

        return commandeService.getAllCommande().stream().map(commande -> modelMapper.map(commande, CommandeDto.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/{type}")
    public Commande createPost(@RequestBody CommandeDto commandeDto, @PathVariable String type) {
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat c = new SimpleDateFormat("ddMMyyyyHHmmss");
        Date date = new Date();
        if (type.equalsIgnoreCase("commande")) {
            // Mise à jour de certains champs
            commandeDto.setEtatCommande("en cours de preparation");
            commandeDto.setNumeroCommande("N°" + c.format(date));
            commandeDto.setDateCommande(s.format(date));
            commandeDto.setStatusCommande("pret pour la livraison");
            // Convertion de la DTO en Entity
            Commande newCommande = commandeMapper.toEntity(commandeDto);
            return commandeRepository.save(newCommande);
        }
        return null;
    }
}
