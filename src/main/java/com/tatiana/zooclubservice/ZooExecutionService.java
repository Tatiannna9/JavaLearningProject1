package com.tatiana.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {
        Animal charlieDog = new Dog(" Charlie");
        System.out.println("numele obiectului este:" + charlieDog.getName());
        charlieDog.setName("Charlie Vaccined");
        System.out.println("numele actualizat al obiectului este:" + charlieDog.getName());

        charlieDog.eat();
        charlieDog.makeSound();

        AnimalInterface rexDog = new Dog("Rex");
        rexDog.makeSound();

        Dog zikDog = new Dog(" Zik");
        zikDog.eat();
        zikDog.makeSound();


        Cat mitzaPisica = new Cat( "Vella");
        mitzaPisica.eat();
        mitzaPisica.makeSound();
    }
}
