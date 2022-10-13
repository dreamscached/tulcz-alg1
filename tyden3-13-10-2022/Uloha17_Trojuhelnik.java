import java.util.Scanner;

public class Uloha17_Trojuhelnik {
    public static void main(String[] args) {
        // Vstupni promenne
        int aX, aY;
        int bX, bY;
        int cX, cY;
        double p, square;

        // Zpracovani vstupu
        Scanner s = new Scanner(System.in);
        System.out.print("(x, y) vrcholu A: ");
        aX = s.nextInt();
        aY = s.nextInt();
        System.out.print("(x, y) vrcholu B: ");
        bX = s.nextInt();
        bY = s.nextInt();
        System.out.print("(x, y) vrcholu C: ");
        cX = s.nextInt();
        cY = s.nextInt();

        // Zpocitani vzdalenosti
        double a = Math.sqrt(Math.pow(aX - bX, 2) + Math.pow(aY - bY, 2));
        double b = Math.sqrt(Math.pow(bX - cX, 2) + Math.pow(bY - cY, 2));
        double c = Math.sqrt(Math.pow(aX - cX, 2) + Math.pow(aY - cY, 2));
        // Zpocitani obsahu
        p = a + b + c;

        // Zpocitani plohy
        double ss = p / 2;
        square = Math.sqrt(ss * (ss - a) * (ss - b) * (ss - c));

        // Vystup
        System.out.printf("Obsah: %f, ploha: %f\n", p, square);
    }
}
