package myfirstpackage;

public class MySecondClass {

    // имеет два приватных поля типа int
    private int a;
    private int b;

    //конструктор, создающий объект и инициализирующий значения полей
    public MySecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // методы для получения и модификации их значений
    public int getAValue() {
        return a;
    }

    public int getBValue() {
        return b;
    }

    public void setAValue(int a) {
        this.a = a;
    }

    public void setBValue(int b) {
        this.b = b;
    }

    //метод реализующий над этими числами действие
    public int Operation() {
        return a - b;
    }
}