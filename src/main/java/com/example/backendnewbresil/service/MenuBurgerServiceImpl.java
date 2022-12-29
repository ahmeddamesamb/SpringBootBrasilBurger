package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.MenuBurger;
import com.example.backendnewbresil.repository.MenuBurgerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuBurgerServiceImpl implements MenuBurgerService{
    private MenuBurgerRepository menuBurgerRepository;
    @Override
    public List<MenuBurger> getAllMenuBurger() {
        return menuBurgerRepository.findAll();
    }

    @Override
    public MenuBurger createMenuBurger(MenuBurger menuBurger) {
        return menuBurgerRepository.save(menuBurger);
    }

    @Override
    public MenuBurger updateMenuBurger(long id, MenuBurger menuBurger) {
        return null;
    }

    @Override
    public void deleteMenuBurger(long id) {

    }

    @Override
    public MenuBurger getMenuBurgerById(long id) {
        return null;
    }
}
