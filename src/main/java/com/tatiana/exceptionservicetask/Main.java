package com.tatiana.exceptionservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
       int result =  ArithmeticOperationService.devideIntWithExeptionHandling(10 , 7);
        System.out.println(result);
        System.out.println("The program is running till end");

        String stringValue = "Tatiana";
        String stringValue2 = null;
        System.out.println(TextManager.getTheTextWithLengthWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTheTextWithLength(stringValue));
        System.out.println(TextManager.getTheTextWithLengthIfElse(stringValue2));

        String filePath = "src/main/java/com/tatiana/exceptionservicetask/test";
        try{
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        }catch (IOException exceptionObject){
            System.out.println("The file does not exists, the execution if the program is not interrupted");
        }finally {
            System.out.println("This block is always executed");
        }
        System.out.println("The program is running");

        ReadDataManager.readDataFromFileWithTryAndCatch(filePath);
        System.out.println("The program is running");

    }
}
