package Example1;

public class App {
    public static double sqr(double arg) {
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;             // ок, вот твой double
        } else if (time % 2 == 1) {
            while (true) ;                 // не, я решил "повиснуть"
        } else{
            throw new RuntimeException(); // или бросить исключение
        }
    }

    public static void main(String[] args) {
        System.out.println(sqr(4));
    }
}