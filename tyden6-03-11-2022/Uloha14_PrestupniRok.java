import java.util.Scanner;

public class Uloha14_PrestupniRok {
    public static void main(String[] args) {
        // Vstupni promenne.
        int year;

        // Zpracovani vstupu.
        Scanner s = new Scanner(System.in);
        System.out.print("Zadejte rok: ");
        year = s.nextInt();

        // Zpracovani a vystup.
        if (year % 4 == 0 && !(year % 100 == 0 && year % 400 > 0)) {
            System.out.printf("Rok %d je prestupni.", year);
        } else {
            System.out.printf("Rok %d neni prestupni.", year);
        }
    }
}
