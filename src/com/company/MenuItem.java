package com.company;
import java.util.Date;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean newStatus;

    public MenuItem(String name) {
        this.name = name;
        this.price = 10.00;
        this.description = "";
        this.category = "food";
        this.newStatus = true;
    }

    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }

    public Double getPrice(){
        return price;
    }
    public void setPrice(Double aPrice) {
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public String getNewStatus() {
        if(newStatus = true) {
            return "new";
        } else return "old";
    }

    public void setNewStatus(Boolean aNewStatus) {
        this.newStatus = aNewStatus;
    }


}
