import java.util.Scanner;

public class Uloha22_Prvocislo {
    public static void main(String[] args) {
        // Vstupni promenne.
        long n;

        // Zpracovani vstupu.
        Scanner s = new Scanner(System.in);
        System.out.print("Zadejte cislo: ");
        n = s.nextLong();

        // Pomocne promenne.
        int d = 2;

        // Vystupne promenne.
        boolean prime = true;

        // Zpracovani.
        while (d <= n / 2) {
            if (n % d == 0) {
                prime = false;
                break;
            }
            d++;
        }

        // Vystup.
        if (!prime) {
            System.out.printf("%d neni prvocislem (delitelne aspon %d).", n, d);
        } else {
            System.out.printf("%d je prvocislem.", n);
        }
    }
}
