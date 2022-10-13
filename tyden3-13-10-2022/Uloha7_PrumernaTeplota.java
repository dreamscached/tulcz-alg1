import java.util.Scanner;

public class Uloha7_PrumernaTeplota {
    public static void main(String[] args) {
        // Vstupni promenne
        int i6, i12, i18;

        // Vystupni promenne
        double mean;

        // Zpracovani vstupu
        Scanner s = new Scanner(System.in);
        System.out.print("Teplota v 6 hodin: ");
        i6 = s.nextInt();
        System.out.print("Teplota v 12 hodin: ");
        i12 = s.nextInt();
        System.out.print("Teplota v 18 hodin: ");
        i18 = s.nextInt();

        // Zpocitani prumeru
        mean = (i6 + i12 + i18 * 2) / 4.0;

        // Vystup
        System.out.printf("Prumer teplot: %f\n", mean);
    }
}