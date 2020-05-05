package com.company;

public class Main {
    public static void main(String[] args) {
        MenuItem newMenuItem = new MenuItem("Pasta");
        Menu newMenu = new Menu("Raiders");
        newMenu.addMenuItem(newMenuItem);
        System.out.println(newMenuItem.getName());
    }
}
