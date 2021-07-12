package Example2;

public class App {
    public static void main(String[] args) {
        double d = sqr(10.0);
        // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
        System.out.println(d);
    }
    public static double sqr(double arg) {
        throw new RuntimeException();
    }
}