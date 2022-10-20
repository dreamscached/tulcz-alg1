import java.util.Scanner;

public class Uloha4_Trojuhelnik {
    public static void main(String[] args) {
        // Vstupni promenne
        int a, b, c;

        // Zpracovani vstupu
        Scanner s = new Scanner(System.in);
        System.out.print("Delka a: ");
        a = s.nextInt();
        System.out.print("Delka b: ");
        b = s.nextInt();
        System.out.print("Delka c: ");
        c = s.nextInt();

        // Kontrola
        boolean ok = a + b > c && Math.abs(a - b) < c;

        // Vystup
        if (ok) {
            System.out.println("Takovy trojuhelnik muze existovat.");
        } else {
            System.out.println("Takovy trojuhelnik nemuze existovat.");
        }
    }
}
