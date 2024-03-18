public class Inheritance1 extends Inheritance {
    int c;

    public Inheritance1(int a, int b) {
        super(a, b);
    }

    public int  add() {
        c = a + b;
        if (c > 0) {
            String massage = "a and b is positiv num!";
        }return c ;
    }
}
