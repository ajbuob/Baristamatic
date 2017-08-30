package com.ajbuob.coffee.domain.menu.factory;

import java.util.SortedSet;
import java.util.TreeSet;

public class MenuItemFactory {

    private static MenuItemFactory instance = null;

    private final SortedSet<String> menuItems = new TreeSet<>();

    private MenuItemFactory() {
        menuItems.add("Coffee");
        menuItems.add("Decaf Coffee");
        menuItems.add("Caffe Latte");
        menuItems.add("Caffe Americano");
        menuItems.add("Caffe Mocha");
        menuItems.add("Cappuccino");
    }

    public SortedSet<String> getMenuItems() {
        return menuItems;
    }

    public static MenuItemFactory getInstance() {
        if (instance == null) {
            instance = new MenuItemFactory();
        }
        return instance;
    }
}