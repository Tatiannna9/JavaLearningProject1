package com.tatiana.operationsandcyclicfuctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber = 0;
        String dayName = "Duminica";

        switch (dayName) {
            case "Luni":
                dayNumber = 1;
                break;
            case "Marti":
                dayNumber = 2;
                break;
            case "Miercuri":
                dayNumber = 3;
                break;
            case "Joi":
                dayNumber = 4;
                break;
            case "Vineri":
                dayNumber = 5;
                break;
            case "Simbata":
                dayNumber = 6;
                break;
            case "Duminica":
                dayNumber = 7;
                break;
            default:
                System.out.println("Nu exista asa zi in saptamina:");
        }

        System.out.println("Numarul zilei " + dayName + " este " + dayNumber);


    }
}
