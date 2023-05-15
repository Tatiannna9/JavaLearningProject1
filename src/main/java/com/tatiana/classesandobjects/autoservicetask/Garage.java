package com.tatiana.classesandobjects.autoservicetask;

public class Garage {


    String address;
    boolean hasComputerDiagnostic;
    int carCapacity;
    String numberId;
    String scheduler;

    Garage(String adressaDataLaCreare){
        this.address = adressaDataLaCreare;
        System.out.println("A fost creat un garaj");

    }

    Garage(int carCapacity){
        this.carCapacity = carCapacity;
        System.out.println("Afiseaza capacitatea");

    }




}
