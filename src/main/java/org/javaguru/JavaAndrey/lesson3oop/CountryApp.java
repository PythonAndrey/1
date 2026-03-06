package org.javaguru.JavaAndrey.lesson3oop;

import java.util.Scanner;

public class CountryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите название страны: ");
        String countryName = input.nextLine();

        System.out.println("Введите код страны: ");
        String countryCode = input.nextLine();

        System.out.println("Введите количество населения страны: ");
        int population = input.nextInt();

        Apple apple1 = new Apple(countryName, countryCode, population);

        System.out.printf("Страна: %s.%nКод страны: %s.%nКоличество населения: %d чел.%n",apple1.getVariety(), apple1.getColor(), apple1.getWeight());
    }
}
