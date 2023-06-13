package com.tatiana.zooclubservice;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    public void eat() {
        System.out.println(getName() + " eats pidigri!");
    }

    public void makeSound() {
        System.out.println(getName() + " ham ham!");
    }
}
