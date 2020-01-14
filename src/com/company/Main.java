package com.company;

public class Main {

    public static void main(String[] args) {

        Latte Latte = new Latte("Латте", 200, "крепкое кофе, молоко, молочная пена", 0.5f,Brands.JACOBS);
        System.out.println(Latte.getInfo());
        Latte.setPrice();

        Cappucino Cappucino = new Cappucino( "Капучино", 180, "крепкое кофе, сливки", 0.5f, Brands.JARDIN);
        System.out.println(Cappucino.getInfo());

        Espresso Espresso = new Espresso ("Эспрессо", 150, "крепкое кофе", 0.5f, Brands.NESCAFE);
        System.out.println(Espresso.getInfo());

    }


}
