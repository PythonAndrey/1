package org.javaguru.JavaAndrey.lesson3oop;

class Сountry {

    // Объекты: countryName - название страны, countryCode - код страны (LV, EE, ...)
    //population - население.
    private final String countryName;
    private final String countryCode;
    private final int population;

    //Конструктор начальных значений для свойств создаваемого объекта Страна.
    public Сountry(String countryName, String countryCode, int population){
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.population = population;
    }

    //Конструктор для получения значения свойств объекта Сountry (Страна) после его создания.
    public String getCountryName(){
        return this.countryName;
    }

    public String getCountryCode(){
        return this.countryCode;
    }

    public int getPopulation(){
        return this.population;
    }
}
