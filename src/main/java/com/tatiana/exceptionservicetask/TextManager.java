package com.tatiana.exceptionservicetask;

public class TextManager {
    public static int getTheTextWithLength(String inputString) {
        return inputString.length();
    }

    public static int getTheTextWithLengthWithTryCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException capturedExceptionInTryBlok) {
            System.out.println("An exception has been captured with the following message: " + capturedExceptionInTryBlok.getMessage());
            return 0;
        } finally {
            System.out.println("Acest cod se executa indiferent daca a fost sau nu capturat o exceptie");
        }

    }

    public static int getTheTextWithLengthIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("input string is a null value, be careful!");
            return 0;
        } else {
            return inputString.length();
        }
    }
}

