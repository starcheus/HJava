package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        People igor = new People();

        igor.name = "Igor";
        igor.surName = "Starcheus";
        igor.age = 31;
        igor.wigth = 100;
        igor.length = 1.8;

        igor.info();
        igor.comment();

//        People olga = new People();
//
//        igor.name = "Olga";
//        igor.surName = "Test";
//        igor.age = 25;
//        igor.wigth = 50;
//        igor.length = 1.8;
//
//        olga.info();
//        olga.comment();

        System.out.println(igor.name.length());
        System.out.println(igor.name.substring(1));
    }
}
