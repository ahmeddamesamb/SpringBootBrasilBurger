package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.MenuBurger;

import java.util.List;

public interface MenuBurgerService {
    List<MenuBurger> getAllMenuBurger();

    MenuBurger createMenuBurger(MenuBurger menuBurger);

    MenuBurger updateMenuBurger(long id, MenuBurger menuBurger);

    void deleteMenuBurger(long id);

    MenuBurger getMenuBurgerById(long id);
}
