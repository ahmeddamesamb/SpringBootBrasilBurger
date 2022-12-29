package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.MenuFrite;
import com.example.backendnewbresil.repository.MenuFriteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuFriteServiceImpl implements MenuFriteService{
    private MenuFriteRepository menuFriteRepository;
    @Override
    public List<MenuFrite> getAllMenuFrite() {
        return menuFriteRepository.findAll();
    }

    @Override
    public MenuFrite createMenuFrite(MenuFrite menuFrite) {
        return menuFriteRepository.save(menuFrite);
    }

    @Override
    public MenuFrite updateMenuFrite(long id, MenuFrite menuFrite) {
        return null;
    }

    @Override
    public void deleteMenuFrite(long id) {

    }

    @Override
    public MenuFrite getMenuFriteById(long id) {
        return null;
    }
}
