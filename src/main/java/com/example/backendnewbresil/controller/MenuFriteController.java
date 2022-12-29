package com.example.backendnewbresil.controller;

import com.example.backendnewbresil.dto.MenuFriteDto;
import com.example.backendnewbresil.dto.MenuTailleDto;
import com.example.backendnewbresil.dto.TailleDto;
import com.example.backendnewbresil.model.MenuFrite;
import com.example.backendnewbresil.model.MenuTaille;
import com.example.backendnewbresil.repository.MenuFriteRepository;
import com.example.backendnewbresil.service.MenuFriteService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/menufrite")
public class MenuFriteController {
    private ModelMapper modelMapper;
    private MenuFriteRepository menuFriteRepository;
    private MenuFriteService menuFriteService;

    public MenuFriteController(ModelMapper modelMapper, MenuFriteRepository menuFriteRepository, MenuFriteService menuFriteService) {
        this.modelMapper = modelMapper;
        this.menuFriteRepository = menuFriteRepository;
        this.menuFriteService = menuFriteService;
    }
    @GetMapping("/{type}")
    public List<MenuFriteDto> getAllMenuFrite(@PathVariable String type) {

        return menuFriteService.getAllMenuFrite().stream().map(menuFrite -> modelMapper.map(menuFrite, MenuFriteDto.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/{type}")
    public MenuFrite createPost(@RequestBody MenuFriteDto menuFriteDto, @PathVariable String type) {
        if (type.equalsIgnoreCase("menuFrite")) {
            MenuFrite newMenuFrite = new MenuFrite();
            newMenuFrite.setQuantiteFrite(menuFriteDto.getQuantiteFrite());
            return menuFriteRepository.save(newMenuFrite);
        }
        return null;
    }
}
