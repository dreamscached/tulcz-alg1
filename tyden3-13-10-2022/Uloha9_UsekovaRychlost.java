import java.util.Scanner;

public class Uloha9_UsekovaRychlost {
    public static void main(String[] args) {
        // Vstupni promenne
        double limit;
        int length;
        int enterH, enterM, enterS, exitH, exitM, exitS;

        // Vystupni promenne
        double mean;
        double excess;

        // Zpracovani vstupu
        Scanner s = new Scanner(System.in);
        System.out.print("Max. povolena rychlost (km/h): ");
        limit = s.nextInt();
        System.out.print("Delka useku (km): ");
        length = s.nextInt();
        System.out.print("Cas vjezdu (HH MM SS): ");
        enterH = s.nextInt();
        enterM = s.nextInt();
        enterS = s.nextInt();
        System.out.print("Cas vyjezdu (HH MM SS): ");
        exitH = s.nextInt();
        exitM = s.nextInt();
        exitS = s.nextInt();

        // Prevod is km/h a kilometru do m/s a metru
        limit /= 3.6;
        length *= 1000;

        // Zpocitani sekund mezi vjezdem a vyjezdem
        int duration = exitH * 60 * 60 + exitM * 60 + exitS - enterH * 60 * 60 - enterM * 60 - enterS;
        // Zpocitani prumeru
        mean = (double) length / duration;
        // Zpocitani prekroceni
        excess = mean - limit;

        // Prevod zpet do km/h
        mean *= 3.6;
        excess *= 3.6;

        // Vystup
        System.out.printf("Prumerna rychlost: %f km/h, prekroceni: %f km/h\n", mean, excess);
    }
}
