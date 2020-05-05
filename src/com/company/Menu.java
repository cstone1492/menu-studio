package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String restaurantName;
    //private Date lastUpdated = 08-09-1990;
    private ArrayList<MenuItem> menuItemList = new ArrayList<>();

    public Menu(String name) {
        this.restaurantName = name;
    }

    public void addMenuItem(MenuItem newMenuItem) {
        menuItemList.add(newMenuItem);
    }

    public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantNameName(String aName) {
        restaurantName = aName;
    }

    /*public Date getLastUpdated(){
        return lastUpdated;
    }
    public void setLastUpdated(Date aDate) {
        lastUpdated = aDate;
    }*/

    public ArrayList<MenuItem> getMenuItemArrayList() {
        return menuItemList;
    }

    public void setMenuItemArrayList(ArrayList<MenuItem> menuItemArrayList) {
        this.menuItemList = menuItemArrayList;
    }
}
