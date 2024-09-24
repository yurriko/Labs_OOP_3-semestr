class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(5, 2);
        System.out.println(o.Operation());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setAValue(i);
                o.setBValue(j);
                System.out.print(o.Operation());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {

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