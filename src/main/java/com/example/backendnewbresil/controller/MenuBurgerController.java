package com.example.backendnewbresil.controller;

import com.example.backendnewbresil.dto.MenuBurgerDto;
import com.example.backendnewbresil.dto.MenuFriteDto;
import com.example.backendnewbresil.model.MenuBurger;
import com.example.backendnewbresil.model.MenuFrite;
import com.example.backendnewbresil.repository.MenuBurgerRepository;
import com.example.backendnewbresil.service.MenuBurgerService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/menuburger")

public class MenuBurgerController {
    private ModelMapper modelMapper;
    private MenuBurgerRepository menuBurgerRepository;
    private MenuBurgerService menuBurgerService;

    public MenuBurgerController(ModelMapper modelMapper, MenuBurgerRepository menuBurgerRepository, MenuBurgerService menuBurgerService) {
        this.modelMapper = modelMapper;
        this.menuBurgerRepository = menuBurgerRepository;
        this.menuBurgerService = menuBurgerService;


    }
    @GetMapping("/{type}")
    public List<MenuBurgerDto> getAllMenuBurger(@PathVariable String type) {

        return menuBurgerService.getAllMenuBurger().stream().map(menuBurger -> modelMapper.map(menuBurger, MenuBurgerDto.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/{type}")
    public MenuBurger createPost(@RequestBody MenuBurgerDto menuBurgerDto, @PathVariable String type) {
        if (type.equalsIgnoreCase("menuBurger")) {
            MenuBurger newMenuBurger = new MenuBurger();
            newMenuBurger.setQuantiteBurger(newMenuBurger.getQuantiteBurger());
            return menuBurgerRepository.save(newMenuBurger);
        }
        return null;
    }
}
