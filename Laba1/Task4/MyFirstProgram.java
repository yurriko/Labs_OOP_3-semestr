import myfirstpackage.*;

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