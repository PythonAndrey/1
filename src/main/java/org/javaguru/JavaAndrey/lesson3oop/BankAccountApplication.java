package org.javaguru.JavaAndrey.lesson3oop;

class BankAccountApplication {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Андрей", 1);
        BankAccount bankAccount2 = new BankAccount("Оксана", 2);

        System.out.println(bankAccount1 + "\n" + bankAccount2);

    }
}
