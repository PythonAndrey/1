package org.javaguru.JavaAndrey.lesson3oop;

import java.util.Scanner;

class BankAccountApplication {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Андрей", 1);
        BankAccount bankAccount2 = new BankAccount("Оксана", 2);

        BankAccount bankAccountOwner3 = new BankAccount("Марина");
        BankAccount bankAccountMoney4 = new BankAccount(100);

        Scanner input = new Scanner(System.in);

        System.out.println("Введите имя клиента:");
        String owner = input.nextLine();

        System.out.println("Введите сумму счета клиента:");
        int money = input.nextInt();

        BankAccount bankAccount5 = new BankAccount(owner, money);

        String owner8 = bankAccount5.getOwner();
        System.out.println(owner8);

        bankAccount1.setMoney(1111);
        bankAccount2.setMoney(2222);
        System.out.println(bankAccount1.getOwner() + " " + bankAccount1.getMoney());
        System.out.println(bankAccount2.getOwner() + " " + bankAccount2.getMoney());

    }
}
