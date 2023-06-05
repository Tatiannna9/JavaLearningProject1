package com.tatiana.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomIn(150, 350);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila randomInt: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("Variabila randomDouble este: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("Variabila randomDouble este: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random email 1:" + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random email 1:" + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random Valid String de X chars: " + DataGeneratorUtil.generateValidRandomString(5));
        System.out.println("Random Valid String de X chars: " + DataGeneratorUtil.generateValidRandomString(8));
        System.out.println("Random Invalid String de X chars: " + DataGeneratorUtil.generateInvalidRandomString(5));

        Customer ionConsumer = new Customer("Ion Sirbu", 27, "ion@gmail.com");
        System.out.println("Nume de obiect Ion: " + ionConsumer.getName());
        System.out.println("Age de obiect Ion: " + ionConsumer.getAge());
        System.out.println("Email de obiect Ion: " + ionConsumer.getEmail());

        ionConsumer.setName("Ion Mardari");
        ionConsumer.setAge(190);
        ionConsumer.setEmail("mardari@gmail.com");

        System.out.println("Nume de obiect Ion: " + ionConsumer.getName());
        System.out.println("Age de obiect Ion: " + ionConsumer.getAge());
        System.out.println("Email de obiect Ion: " + ionConsumer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12), DataGeneratorUtil.getRandomInt(127),
                DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomIn(18, 64));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());
    }
}
