package com.company;

public class Latte extends Coffee {
    private int cupSize;

    public Latte(String name, int price, String ingredients, float volume, Brands Brands) {
        super(name, price, ingredients, volume,Brands);
    }

    public void setPrice() {
        System.out.println("сом");
    }


    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public final void setPrice(Brands brands, int cupSize) {
        for (int i = 0; i <cupSize; i++) {
            System.out.println("Цена ");

        }


    }
}