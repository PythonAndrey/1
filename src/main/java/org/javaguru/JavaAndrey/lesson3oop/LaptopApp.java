package org.javaguru.JavaAndrey.lesson3oop;

import java.util.Scanner;

public class LaptopApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите модель ноутбука: ");
        String model = input.nextLine();

        System.out.println("Введите цену ноутбука: ");
        int price = input.nextInt();

        Laptop laptop = new Laptop(model, price);

        System.out.printf("Модель ноутбука: %s.%nЦена ноутбука: %s руб.%n",laptop.getModel(), laptop.getPrice());

    }
}
