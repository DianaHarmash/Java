package com.company;

public class Main {

    public static void main(String[] args) {
       ImmutableClass animal = new ImmutableClass("Lion", "light-brown", false, true);
       System.out.println(animal);
       animal = animal.setEyeColour("brown");
       System.out.println(animal);
       animal = animal.setAnimal("Chicken").setHasWings(true).setHasTail(false);
       System.out.println(animal); 
    }
}
