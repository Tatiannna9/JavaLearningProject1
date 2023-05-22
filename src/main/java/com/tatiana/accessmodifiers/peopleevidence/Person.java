package com.tatiana.accessmodifiers.peopleevidence;

public class Person {

    //This Property is class related - Class Variables, it is private - it can be accessed only within the Person
    private static int numarTotalDePersoane;
    // The final key word described a non-access modifier which means that this property will not be changed during the execution and it has to be initialized once the object is created.
    private final long CNP;
    //The gender and name are instance variables because they described the objects of the class. Public means they can be accessed from anywhere in the project.
    public String gender;
    public String name;
    //IDNP
    public String Address;
    //The protected property can be accessed only from classes which belongs to peopleevindence package and subclasses
    protected String phone;
    //The default  property can be accessed only from classes which belongs to peopleevindence.
    double heigh;
    String eyeColour;
    double weight;
    String education;
    String nationality;
    boolean isMarried;
    String readingBooks;
    String emailAddress;
    String Ocupation;

    //This is an instance variable and it is declared as private - it can be accessed only from Person class
    private int age;

    //There is a constructor with only one parameter that is mandatory field
    public Person(long CNPObligatoriuLaCreare) {
        CNP = CNPObligatoriuLaCreare;
        numarTotalDePersoane++;
    }

    //There is a constructor with multiple parameters that contains the mandatory CNP fields too
    public Person(long CNP, String name, boolean isMarried, int age) {
        this.CNP = CNP;
        this.name = name;
        this.isMarried = isMarried;
        this.age = age;
        numarTotalDePersoane = numarTotalDePersoane + 1;
    }

    public static void printNumberOfPeople() {
        System.out.println("Numarul total de persoane este = " + numarTotalDePersoane);
    }

    @Override
    public String toString() {
        return "Person{" +
                "CNP=" + CNP +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", phone='" + phone + '\'' +
                ", heigh=" + heigh +
                ", eyeColour='" + eyeColour + '\'' +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                ", nationality='" + nationality + '\'' +
                ", isMarried=" + isMarried +
                ", readingBooks='" + readingBooks + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", Ocupation='" + Ocupation + '\'' +
                ", age=" + age +
                '}';
    }
}

