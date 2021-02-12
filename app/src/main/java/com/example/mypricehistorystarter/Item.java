package com.example.mypricehistorystarter;

public class Item {

    private String Name;
    private Double Price;

    public Item(String name, Double price) {
        this.Name = name;
        this.Price = price;

    }

    public Item() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;

    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return Name + "  -  $" +Price;
    }

}