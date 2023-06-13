package com.tatiana.exceptionservicetask;

public class ArithmeticOperationService {
    public static int devideIntNoExeptionHandling(int a, int b){
        return a / b;
    }
    public static int devideIntWithExeptionHandling(int a, int b){
       try {
           int result = a/b;
           return result;
       }catch ( Exception capturedException){
           System.out.println("An exception has ocurred: " + capturedException.getMessage() );
           return 0;

       }

    }


}
