package com.tatiana.zooclubservice;

public class Fox extends Animal{

    public Fox(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getName() + "eats chicken!");
    }

    public void makeSound() {
        System.out.println(getName() + " chiu chiuu");
    }
}
