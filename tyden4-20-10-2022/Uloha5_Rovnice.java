import java.util.Scanner;

public class Uloha5_Rovnice {
    public static void main(String[] args) {
        // Vstupni promenne
        int r;
        int a = 0;
        int b;
        int c;

        // Zpracovani vstupu
        Scanner s = new Scanner(System.in);
        System.out.print("Rad rovnice (1, 2): ");
        r = s.nextInt();
        if (r == 2) {
            System.out.print("a: ");
            a = s.nextInt();
        }
        System.out.print("b: ");
        b = s.nextInt();
        System.out.print("c: ");
        c = s.nextInt();

        // Vystupni promenne
        double x0;
        double x1;
        double x2;

        // Zpocitani
        if (r == 2) {
            double d = Math.pow(b, 2) - 4 * a * c;
            if (d < 0) {

            } else if (d == 0) {
                x0 = -b / (2.0 * a);
                System.out.printf("x: %f", x0);
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.printf("x1: %f, x2: %f", x1, x2);
            }
        } else {
            x0 = -(b + c);
            System.out.printf("x: %f", x0);
        }
    }
}
