package org.javaguru.JavaAndrey.lesson3oop;

class Apple {

    // Объекты: Variety - сорт, Color - цвет, Weight - вес
    private String variety;
    private String color;
    private int weight;

    //Конструктор начальных значений для свойств создаваемого объекта Яблоко.
    public Apple(String variety, String color, int weight){
        this.variety = variety;
        this.color =color;
        this.weight = weight;
    }

}
