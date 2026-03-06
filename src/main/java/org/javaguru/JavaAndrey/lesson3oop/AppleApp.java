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
        int weight = input.nextInt();

        Apple apple1 = new Apple(variety, color, weight);

        System.out.printf("Сорт яблока: %s.%nЦвет яблока: %s.%nВес яблока: %d грамм.%n",apple1.getVariety(), apple1.getColor(), apple1.getWeight());
    }
}
