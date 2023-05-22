package com.tatiana.accessmodifiers;

import com.tatiana.accessmodifiers.peopleevidence.Person;

    public class ChisinauEvidenceCatalog {
        public static void main(String[] args) {
            Person ionCreanga = new Person(4543654789456L);
            ionCreanga.Address = " Strada secreta";
            ionCreanga.gender = " masculin";
            System.out.println(ionCreanga.toString());
            Person.printNumberOfPeople();

            Person mihaiEminescu = new Person(1236547446545L, " mihai", false, 37);
            mihaiEminescu.Address = " Onisifor Ghibu 23";
            mihaiEminescu.gender = " masculin";
            System.out.println(mihaiEminescu.toString());
            Person.printNumberOfPeople();

            Person VasileRomanciuc = new Person(12345547446545L, "Vasile", false, 43);
            VasileRomanciuc.gender = " Masculin";
            VasileRomanciuc.Address = " Stefan cel Mare 126";
            System.out.println(VasileRomanciuc.toString());
            Person.printNumberOfPeople();

            Person IonDruta = new Person(123455445456545L, "Ion", false, 86);
            IonDruta.Address = " Strada Nicolae Costin 23";
            IonDruta.gender = "Masculin";
            System.out.println(IonDruta.toString());
            Person.printNumberOfPeople();

        }


    }