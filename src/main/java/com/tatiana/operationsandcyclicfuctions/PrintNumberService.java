package com.tatiana.operationsandcyclicfuctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 500;
        int limit = 500;

        while (a > 0) {
            System.out.print(a + ", ");
//          a = a - 1;
//          a -=1;
            a--;

            //Valoarea lui a dupa ce iesa din ciclu while este zero

        }
        System.out.println();

        do {
            System.out.print(a + ", ");
           // a++;
            a = a + 1;
        }while (a < limit);


        System.out.println();

        for(int i = 1 ; i<= limit; i++ ){
            System.out.print(i + ", ");
        }

        System.out.println();

        for(int i = 2 ; i<= limit; i++ ){
            if ( i % 2 == 0){
                System.out.print(i + ", ");
            } else
                System.out.print(" [], ");
        }


    }
}
