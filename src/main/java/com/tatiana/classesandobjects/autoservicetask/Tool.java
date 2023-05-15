package com.tatiana.classesandobjects.autoservicetask;

public class Tool {


    boolean needsElectricity;
    boolean isElevator;
    boolean isUsed;
    long uniqueCode;

    Tool(boolean needsElectricity) {
        System.out.println("A fost creat un instrument despre care nu se stie nimic");
    }

    Tool(long uniqueCodeParam) {
        System.out.println("A fost creat un nour instrument despre care se cunoaste doar codul");



    }
}
