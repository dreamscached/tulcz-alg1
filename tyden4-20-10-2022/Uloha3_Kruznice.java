import java.util.Scanner;

public class Uloha3_Kruznice {
    public static void main(String[] args) {
        // Vstupni promenne
        int xp, yp;
        int xc, yc, pc;

        // Zpracovani vstupu
        Scanner s = new Scanner(System.in);
        System.out.print("x bodu: ");
        xp = s.nextInt();
        System.out.print("y bodu: ");
        yp = s.nextInt();
        System.out.print("x kruznice: ");
        xc = s.nextInt();
        System.out.print("y kruznice: ");
        yc = s.nextInt();
        System.out.print("polomer kruznice: ");
        pc = s.nextInt();

        // Zpocitani
        double d = Math.sqrt(Math.pow((xp - xc), 2) + Math.pow((yp - yc), 2));
        if (d < pc) {
            System.out.println("Bod je v kruznici");
        } else if (d == pc) {
            System.out.println("Bod je na kruznici");
        } else {
            System.out.println("Bod je mimo kruznici");
        }
    }
}
