package com.tatiana.operationsandcyclicfuctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        //Atribuire Simpla
        int result = a;
        System.out.println("Atribuire simple:" + result);

        //Atribuire cu adunare
        //result = result + b;
        result += b;
        System.out.println("Atribuire cu adunare:" + result);

        //Atribuire cu scadere
        //result = result - b;
        result -= b;
        System.out.println("Atribuire cu scadere:" + result);

        //Atribuire cu inmultire
        //result = result * b;
        result *= b;
        System.out.println("Atribuire cu inmultire:" + result);

        //Atribuire cu impartire
        //result = result / b;
        result /= b;
        System.out.println("Atribuire cu impartire:" + result);

        //Atribuire cu restul impartirii
        // result = result % b;
        result %= b;
        System.out.println("Atribuire cu restul impartirii:" + result);
    }
}
