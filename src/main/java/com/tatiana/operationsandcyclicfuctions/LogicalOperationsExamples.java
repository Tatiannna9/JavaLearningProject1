package com.tatiana.operationsandcyclicfuctions;

public class LogicalOperationsExamples {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result = a && b;
        System.out.println("Logic and: " + result);

        a = result && b;
        System.out.println("Logic and: " + a);

        result = a || b;
        System.out.println("Logic and: " + result);

        System.out.println("Negation: " + !!!result);

    }
}
