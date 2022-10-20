import java.util.Scanner;

public class Uloha15_RodleCislo {
    public static void main(String[] args) {
        // Vstupni promenne
        int a, b;

        // Zpracovani vstupu
        Scanner s = new Scanner(System.in);
        System.out.print("Prvni cast RC: ");
        a = s.nextInt();
        System.out.print("Druha cast RC: ");
        b = s.nextInt();

        // Vyjadreni casti
        int year = a / 100000 % 1000;
        int month = a / 100 % 100;
        int day = a % 100;
        int ext = b / 100;
        int c = 0;
        if (b >= 1000) c = b % 10;

        if (c == 0) {
            if (year < 54) {
                year += 1900;
            } else {
                year += 1800;
            }
        } else {
            int mod = (a * 1000 + ext) % 11;
            if (mod == 10) mod = 0;
            if (mod != c) {
                System.out.println("Nevalidni");
                return;
            }

            if (year < 54) {
                year += 2000;
            } else {
                year += 1900;
            }
        }

        if (month > 70 && year > 2003) {
            month -= 70;
        } else if (month > 50) {
            month -= 50;
        } else if (month > 20 && year > 2003) {
            month -= 20;
        }

        System.out.println("Validni");
    }
}
