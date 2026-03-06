package org.javaguru.JavaAndrey.lesson3oop;

class Apple {

    // Объекты: Variety - сорт, Color - цвет, Weight - вес
    private final String variety;
    private final String color;
    private final int weight;

    //Конструктор начальных значений для свойств создаваемого объекта Яблоко.
    public Apple(String variety, String color, int weight){
        this.variety = variety;
        this.color =color;
        this.weight = weight;
    }
    //Конструктор для получения значения свойств объекта Apple(Яблоко) после его создания.
    public String getVariety(){
        return this.variety;
    }
    public String getColor(){
        return this.color;
    }
    public int getWeight(){
        return this.weight;
    }
}
