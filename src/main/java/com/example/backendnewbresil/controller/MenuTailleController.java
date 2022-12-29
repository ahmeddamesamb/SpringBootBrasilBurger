package com.example.backendnewbresil.controller;

import com.example.backendnewbresil.dto.MenuTailleDto;
import com.example.backendnewbresil.dto.TailleDto;
import com.example.backendnewbresil.model.MenuTaille;
import com.example.backendnewbresil.model.Taille;
import com.example.backendnewbresil.repository.MenuTailleRepository;
import com.example.backendnewbresil.service.MenuTailleService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/menutaille")
public class MenuTailleController {
    private MenuTailleRepository menuTailleRepository;
    private ModelMapper modelMapper;
    private MenuTailleService menuTailleService;

    public MenuTailleController(MenuTailleRepository menuTailleRepository, ModelMapper modelMapper, MenuTailleService menuTailleService) {
        this.menuTailleRepository = menuTailleRepository;
        this.modelMapper = modelMapper;
        this.menuTailleService = menuTailleService;
    }

    @GetMapping("/{type}")
    public List<MenuTailleDto> getAllTaille(@PathVariable String type) {

        return menuTailleService.getAllMenuTaille().stream().map(menuTaille -> modelMapper.map(menuTaille, MenuTailleDto.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/{type}")
    public MenuTaille createPost(@RequestBody MenuTailleDto menuTailleDto, @PathVariable String type) {
        if (type.equalsIgnoreCase("menuTaille")) {
            MenuTaille newMenuTaille = new MenuTaille();
            newMenuTaille.setQuantiteTaille(menuTailleDto.getQuantiteTaille());
            return menuTailleRepository.save(newMenuTaille);
        }
        return null;
    }
}
