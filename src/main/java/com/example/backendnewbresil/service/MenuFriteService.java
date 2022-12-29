package com.example.backendnewbresil.service;

import com.example.backendnewbresil.model.MenuFrite;

import java.util.List;

public interface MenuFriteService {
    List<MenuFrite> getAllMenuFrite();

    MenuFrite createMenuFrite(MenuFrite menuFrite);

    MenuFrite updateMenuFrite(long id, MenuFrite menuFrite);

    void deleteMenuFrite(long id);

    MenuFrite getMenuFriteById(long id);
}
