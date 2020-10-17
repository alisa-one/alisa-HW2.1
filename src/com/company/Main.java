package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int age = 18;
        int temp = 20;
        System.out.println(outDoor(age, temp));
        System.out.println(outDoor(age = 17, temp = -32));
        System.out.println(outDoor(age = 32, temp = 18));
        System.out.println(outDoor(age = 48, temp = 28));
        System.out.println(outDoor(age = 29, temp = -35));
        System.out.println(generRandomAge());
        System.out.println(outDoor(generRandomAge(),temp));
    }

    public static String outDoor(int age, int temp) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30)
            return "Можно идти гулять";
        if (age <= 20 && temp >= 0 && temp <= 28)
            return "Можно идти гулять";
        if (age >= 45 && temp >= -10 && temp <= 25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }


    public static int generRandomAge() {
        Random random = new Random();
        return random.nextInt(99);
    }
    }
