package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.MenuTaille;

import java.util.List;

public interface MenuTailleService {
    List<MenuTaille> getAllMenuTaille();

    MenuTaille createMenuTaille(MenuTaille menuTaille);

    MenuTaille updateMenuTaille(long id, MenuTaille menuTaille);

    void deleteMenuTaille(long id);

    MenuTaille getMenuTailleById(long id);
}
