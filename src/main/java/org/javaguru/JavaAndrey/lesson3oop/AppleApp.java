package org.javaguru.JavaAndrey.lesson3oop;

import java.util.Scanner;

public class AppleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите сорт яблока: ");
        String variety = input.nextLine();

        System.out.println("Введите цвет яблока: ");
        String color = input.nextLine();

        System.out.println("Введите вес яблока: ");
        String weight = input.nextLine();
    }
}
