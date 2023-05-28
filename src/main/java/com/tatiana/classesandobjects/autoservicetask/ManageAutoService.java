package com.tatiana.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage garajulLuiAndrei = new Garage("Lunca Nistrului");
        System.out.println("Adresa garajului lui Andrei este " + garajulLuiAndrei.address);
        garajulLuiAndrei.carCapacity = 342;
        garajulLuiAndrei.hasComputerDiagnostic = true;
        garajulLuiAndrei.numberId = "2323";
        garajulLuiAndrei.scheduler = "uneori";

        System.out.println("Garajul lui Andrei are urmatoarele proprietati: Adresa" + garajulLuiAndrei.address +
                " CarCapacity:" + garajulLuiAndrei.carCapacity + " numberID:" + garajulLuiAndrei.numberId + ", Orar de lucru:" +
                garajulLuiAndrei.scheduler + ", hasElevator:" + garajulLuiAndrei.hasComputerDiagnostic);

        Garage garajulLuiVanea = new Garage(" Valea Perjii");
        System.out.println("Adresa garajului lui Vanea este" + garajulLuiVanea.address);
        garajulLuiVanea.carCapacity = 350;
        garajulLuiVanea.hasComputerDiagnostic = false;
        garajulLuiVanea.numberId = "33212";
        garajulLuiVanea.scheduler = "mai des";

        System.out.println("Garajul lui Vanea are urmatoarele proprietati: Adresa" + garajulLuiVanea.address +
                " CarCapacity:" + garajulLuiVanea.carCapacity + " numberID:" + garajulLuiVanea.numberId + ", Orar de lucru:" +
                garajulLuiVanea.scheduler + ", hasElevator:" + garajulLuiVanea.hasComputerDiagnostic);

        Car masinaLuiIulian = new Car("Mercedes", "GLE Class", 2022, "Diesel");

        masinaLuiIulian.carPrice = 56233;
        masinaLuiIulian.km = 120000;
        masinaLuiIulian.gearType = "Automatical";

        System.out.println("Masina lui Iulian are urmatoarele probleme dar si propietati: Make:" + masinaLuiIulian.make +
                ",Model:" + masinaLuiIulian.model + ", Production Year: " + masinaLuiIulian.productionYear + ",Fuel Type" +
                masinaLuiIulian.fuelType + ", Car Price" + masinaLuiIulian.carPrice + ",km:" + masinaLuiIulian.km + ", Gear Type:" +
                masinaLuiIulian.gearType);

        Car masinaAmeliei = new Car("Volvo" , "XC40");
        masinaAmeliei.carPrice = 63233;
        masinaAmeliei.km = 40000;
        masinaAmeliei.gearType = "Automatical";

        System.out.println("Masina Ameliei are urmatoarele probleme dar si propietati: Make:" + masinaAmeliei.make +
                ",Model:" + masinaAmeliei.model + ", Production Year: " + masinaAmeliei.productionYear + ",Fuel Type" +
                masinaAmeliei.fuelType + ", Car Price" + masinaAmeliei.carPrice + ",km:" + masinaAmeliei.km + ", Gear Type:" +
                masinaAmeliei.gearType);


        Tool elevatorTool = new Tool(232324512);

        elevatorTool.isElevator = true;
        elevatorTool.isUsed = true;
        elevatorTool.needsElectricity = true;

        System.out.println("Obiectul elevatorTool  are proprietatile:" +
                " Cod unic:" + elevatorTool.uniqueCode +
                " Este elevator:" + elevatorTool.isElevator +
                " Foloseste electricitate:" + elevatorTool.needsElectricity +
                " Este utilizat:" + elevatorTool.isUsed);

        Tool hammerDrill = new Tool(true);
        hammerDrill.isElevator = false;
        hammerDrill.isUsed = true;
        hammerDrill.needsElectricity = true;

        System.out.println("Obiectul hammerDrill  are proprietatile:" +
                " Cod unic:" + hammerDrill.uniqueCode +
                " Este elevator:" + hammerDrill.isElevator +
                " Foloseste electricitate:" + hammerDrill.needsElectricity +
                " Este utilizat:" + hammerDrill.isUsed);

        Worker lucratorulValeri = new Worker();

        lucratorulValeri.nume = "Valerie";
        lucratorulValeri.age = 46;
        lucratorulValeri.sextype = "Masculin";
        lucratorulValeri.isExperienced = true;
        lucratorulValeri.specialization = "Electric Auto";

        System.out.println("Obiectul lucratorulValerie are proprietatile:" +
                        " Nume:" + lucratorulValeri.nume +
                        " Visrta:" + lucratorulValeri.age +
                        " Experienta:" + lucratorulValeri.isExperienced +
                        " Sex type:" + lucratorulValeri.sextype +
                        " Specializare:" + lucratorulValeri.specialization

                //teste teste

        );


    }

}
