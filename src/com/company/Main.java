package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        method();
        work();
        //cal hw
    }


    public static void method() {
        System.out.println("Input your age");
        Scanner scanner = new Scanner(System.in);
        int inputAge = scanner.nextInt();
        System.out.println("Input your name");
        String name = scanner.nextLine();
        System.out.println(name);

        if (inputAge > 50) {
            System.out.println("you are old");
        } else if (inputAge < 10) {
            System.out.println("you are young");
        } else {
            System.out.println("you are middle");
        }

        switch (inputAge) {
            case 10:
                System.out.println("you are 10 years old");
                break;
            case 20:
                System.out.println("you are 20 years old");
                break;
        }

        System.out.println("hello world!");


        int[] ages = {3, 3, 23, 32, 3, 32};

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        for (int age : ages) {
            System.out.println(age);
        }
    }

    public static void work() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чиcло a и b");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        System.out.println("А) Сложить Б) Вычесть В) Умножить Г) Разделить");
        String answer = scanner.next();
        switch (answer) {
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            case "/":
                System.out.println(firstNum / secondNum);
                break;
        }

        int[] nums = {4, 3, 34, 5, -6, 4, 3, -3, 4, 4};
        Random ran = new Random();
        int x = ran.nextInt(2) + 5;
        System.out.println(x);
    }

    public  static void calculator(){

    }
}
