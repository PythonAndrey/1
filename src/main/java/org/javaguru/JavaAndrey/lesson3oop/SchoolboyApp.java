package org.javaguru.JavaAndrey.lesson3oop;

import java.util.Scanner;

public class SchoolboyApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите имя ученика: ");
        String studentName = input.nextLine();

        System.out.println("Введите фамилию ученика: ");
        String studentLastName = input.nextLine();

        System.out.println("Введите название предмета: ");
        String itemName = input.nextLine();

        System.out.println("Введите оценку: ");
        int estimation = input.nextInt();

        Schoolboy schoolboy = new Schoolboy(studentName, studentLastName, itemName, estimation);

        System.out.printf("Имя ученика: %s.%nФамилия ученика: %s.%nНазвание предмета: %s.%nОценка: %d.%n", schoolboy.getStudentName(), schoolboy.getStudentLastName(), schoolboy.getItemName(), schoolboy.getEstimation());
    }
}
