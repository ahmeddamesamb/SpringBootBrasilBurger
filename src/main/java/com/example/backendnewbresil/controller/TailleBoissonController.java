package com.example.backendnewbresil.controller;

import com.example.backendnewbresil.dto.TailleBoissonDto;
import com.example.backendnewbresil.dto.ZoneDto;
import com.example.backendnewbresil.model.TailleBoisson;
import com.example.backendnewbresil.model.Zone;
import com.example.backendnewbresil.repository.TailleBoissonRepository;
import com.example.backendnewbresil.service.TailleBoissonService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tailleboisson")
public class TailleBoissonController {

    private TailleBoissonRepository tailleBoissonRepository;
    private ModelMapper modelMapper ;
    private TailleBoissonService tailleBoissonService;


    public TailleBoissonController(TailleBoissonRepository tailleBoissonRepository, ModelMapper modelMapper, TailleBoissonService tailleBoissonService) {
        super();
        this.tailleBoissonRepository = tailleBoissonRepository;
        this.modelMapper = modelMapper;
        this.tailleBoissonService = tailleBoissonService;
    }
    @GetMapping("/{type}")
    public List<TailleBoissonDto> getAllZone(@PathVariable String type) {

        return tailleBoissonService.getAllTailleBoisson().stream().map(tailleBoisson -> modelMapper.map(tailleBoisson, TailleBoissonDto.class))
                .collect(Collectors.toList());
    }
    @PostMapping("/{type}")
    public TailleBoisson createPost(@RequestBody TailleBoissonDto tailleBoissonDto , @PathVariable String type) {
        if (type.equalsIgnoreCase("tailleBoisson"))
        {
            TailleBoisson newTailleBoisson=new TailleBoisson();
            newTailleBoisson.setQuantiteStock(tailleBoissonDto.getQuantiteStock());
            return tailleBoissonRepository.save(newTailleBoisson);
        }
        return null;
    }

}
