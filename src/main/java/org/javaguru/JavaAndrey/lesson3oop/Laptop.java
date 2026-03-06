package org.javaguru.JavaAndrey.lesson3oop;

class Laptop {

    // Объекты: model - модель, price - цена
    private final String model;
    private final int price;

    //Конструктор начальных значений для свойств создаваемого объекта Ноутбук.
    public Laptop(String model, int price){
        this.model = model;
        this.price = price;
    }

    //Конструктор для получения значения свойств объекта LapTop (Ноутбук) после его создания.
    public String getModel(){
        return this.model;
    }

    public int getPrice(){
        return this.price;
    }
}
