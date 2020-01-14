package com.company;

import javax.xml.namespace.QName;

public class Coffee {
    private String name;
    private int price;
    private String ingredients;
    private float volume;
    private Brands Brands;



    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public float getVolume() {
        return volume;
    }
    public Coffee(){};

    public com.company.Brands getBrands() {
        return Brands;
    }

    public Coffee(String name, int price, String ingredients, float volume,  Brands Brands
    ) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.volume = volume;
        this.Brands=Brands;
    }


    public String getInfo() {

        return "Название: " + getName() + " " +

                "Цена: " + getPrice() + " " +

                "Состав " + getIngredients() + " " +

                "Объем: " + getVolume();
    }


    }


