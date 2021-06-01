package com.company;

public class People {

    static int age = 0;
    static String name = "defaultName";
    static String surName = "defaultSurName";
    static int wigth = 3;
    static double length = 0.5;

    public static void info(){

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println(surName);
        System.out.println(wigth);
        System.out.println(length);
        System.out.println("------- End people information -------");
    }

    public static void comment(){
        if (true){
            System.out.println("Old school");
        }
        else System.out.println("Child");

    }
}
