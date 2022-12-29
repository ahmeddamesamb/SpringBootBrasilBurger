package com.example.backendnewbresil.controller;

import com.example.backendnewbresil.dto.ProduitDto;
import com.example.backendnewbresil.dto.ZoneDto;
import com.example.backendnewbresil.model.Produit;
import com.example.backendnewbresil.model.Zone;
import com.example.backendnewbresil.repository.ZoneRepository;
import com.example.backendnewbresil.service.ZoneService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/zone")
public class ZoneController {

    private final ModelMapper modelMapper;
    private final ZoneRepository zoneRepository;
    private final ZoneService zoneService;

    public ZoneController(ModelMapper modelMapper, ZoneRepository zoneRepository, ZoneService zoneService) {
        this.modelMapper = modelMapper;
        this.zoneRepository = zoneRepository;
        this.zoneService = zoneService;
    }
    @GetMapping("/{type}")
    public List<ZoneDto> getAllZone(@PathVariable String type) {

        return zoneService.getAllZone().stream().map(zone -> modelMapper.map(zone, ZoneDto.class))
                .collect(Collectors.toList());
    }
    @PostMapping("/{type}")
    public Zone createPost(@RequestBody ZoneDto zoneDto , @PathVariable String type) {
        if (type.equalsIgnoreCase("zone"))
        {
            Zone newZone=new Zone();
            newZone.setEtatZone("Praticable");
            newZone.setNomZone(zoneDto.getNomZone());
            newZone.setCoutLivraison(newZone.getCoutLivraison());
            return zoneRepository.save(newZone);
        }
        return null;
    }
}
