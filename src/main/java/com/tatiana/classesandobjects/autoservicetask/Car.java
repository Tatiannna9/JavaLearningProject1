package com.tatiana.classesandobjects.autoservicetask;

public class Car {

    int km;
    String gearType;
    String name;
    String make;
    String model;
    int productionYear;
    double carPrice;
    String fuelType;

    Car(String make, String model, int productionYear, String fuelType) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.fuelType  = fuelType;
        System.out.println("In urma executiei acestui constructor 4 parametri se creeaza un nou obiect despre care nu cunoastem price, geartype, km");


    }

    Car(String make, String model) {
        this.make = make;
        this.model = model;
        System.out.println("A fost creat o masina despre care cunoastem doar Marca, model");
    }


}
