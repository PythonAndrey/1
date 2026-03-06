package org.javaguru.JavaAndrey.lesson3oop;

class Schoolboy {

    // Объекты: studentName - имя ученика, studentLastName - фамилия ученика,
    //itemName - название предмета, estimation - оценка.
    private final String studentName;
    private final String studentLastName;
    private final String itemName;
    private final int estimation;

    //Конструктор начальных значений для свойств создаваемого объекта оценка ученика.
    public Schoolboy(String studentName, String studentLastName, String itemName, int estimation){
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.itemName = itemName;
        this.estimation = estimation;

    }

    //Конструктор для получения значения свойств объекта Schoolboy (оценка ученика) после его создания.
    public String getStudentName(){
        return this.studentName;
    }

    public  String getStudentLastName(){
        return this.studentLastName;
    }

    public String getItemName(){
        return this.itemName;
    }

    public int getEstimation(){
        return this.estimation;
    }

}
