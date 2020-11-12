package com.company;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 1 Задание
        String result = ageAndTemperature(21, 22);
        System.out.println(result);

        // 2 Задание
        // Примечание: Сделал чуть иначе чтобы else выводился 1 раз только в случае если ни 1 if не сработает

        int age = 20;
        int temperature = 39;
        if (age >= 1 && temperature < 30) {
            if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
                System.out.println("Можно идти гулять");
            }

            if (age < 20 && (temperature > 0 && temperature < 28)) {
                System.out.println("Можно идти гулять");
            }
            if (age > 45 && (temperature > -10 && temperature < 25)) {
                System.out.println("Можно идти гулять");
            } else {
                System.out.println("Оставайся дома");
            }
        } else {
            System.out.println("Оставайся дома");
        }
//3 Задание
        System.out.println(methodWithArguments("Мурас", "Усубалиев"));
        System.out.println(methodWithArguments("Карина", "Салиева"));
        System.out.println(methodWithArguments("Алина", "Ринатова"));
        System.out.println(methodWithArguments("Азат", "Сарычев"));
        System.out.println(methodWithArguments("Андрей", "Щекин"));


// Рандомное число от 0 до 50
        System.out.println("Random = "+generateRandomAge());

        int randomAge = generateRandomAge();
        int randomTemperature = generateRandomAge();
        System.out.println("randomAge = "+randomAge+" randomTemperature = "+randomTemperature);
        if (randomAge >= 1 && randomTemperature < 30) {
            if ((randomAge > 20 && age < 45) && (randomTemperature > -20 && randomTemperature < 30)) {
                System.out.println("Можно идти гулять");
            }

            if (randomAge < 20 && (randomTemperature > 0 && randomTemperature < 28)) {
                System.out.println("Можно идти гулять");
            }
            if (randomAge > 45 && (randomTemperature > -10 && randomTemperature < 25)) {
                System.out.println("Можно идти гулять");
            } else {
                System.out.println("Оставайся дома");
            }
        } else {
            System.out.println("Оставайся дома");
        }
    }

    public static String methodWithArguments(String name, String surname) {
        String space = " ";
        return name + space + surname;
    }


    public static String ageAndTemperature(int age, int temperature) {
        return "Возраст = " + age + " Температура = " + temperature;
    }

    //ДЗ на сообразительность:
    public static int generateRandomAge() {
        Random rand = new Random();
        int random = rand.nextInt(50);
        return random;
    }
}
