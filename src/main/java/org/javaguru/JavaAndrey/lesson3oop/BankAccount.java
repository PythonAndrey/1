package org.javaguru.JavaAndrey.lesson3oop;

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner){
        this.owner = owner;
        this.money = 0;
    }

    public BankAccount(String owner, int money){
        this.owner = owner;
        this.money = money;
    }

}

