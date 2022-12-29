package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.MenuTaille;
import com.example.backendnewbresil.repository.MenuTailleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuTailleServiceImpl implements MenuTailleService{
    private final MenuTailleRepository menuTailleRepository;

    public MenuTailleServiceImpl(MenuTailleRepository menuTailleRepository) {
        this.menuTailleRepository = menuTailleRepository;
    }

    @Override
    public List<MenuTaille> getAllMenuTaille() {
        return menuTailleRepository.findAll();
    }

    @Override
    public MenuTaille createMenuTaille(MenuTaille menuTaille) {
        return menuTailleRepository.save(menuTaille);
    }

    @Override
    public MenuTaille updateMenuTaille(long id, MenuTaille menuTaille) {
        return null;
    }

    @Override
    public void deleteMenuTaille(long id) {

    }

    @Override
    public MenuTaille getMenuTailleById(long id) {
        return null;
    }
}
