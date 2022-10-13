import java.util.Scanner;

public class Uloha13_Alkohol {
    public static void main(String[] args) {
        // Vstupni promenne
        double drankAmount;
        double alcoholShare;
        double weight;

        // Vystupni promennne
        double duration;

        // Constanty
//        final double density = 0.8;
//        final double hydration = 0.7;
        final double digestion = 0.1;

        // Zpracovani vstupu
        Scanner s = new Scanner(System.in);
        System.out.print("Objem vypiteho: ");
        drankAmount = s.nextDouble();
        System.out.print("Podil alkoholu: ");
        alcoholShare = s.nextDouble();
        System.out.print("Hmotnost konzumenta: ");
        weight = s.nextDouble();

        // Zpocitani hmotnosti etanolu
        double ethanolMass = (drankAmount * alcoholShare) / 100;
//        double promille = ethanolMass / (weight * hydration);
        // Zpocitani rychlosti odbouravani
        double digestionSpeed = weight * digestion;
        // Zpocitani doby odbouravani
        duration = ethanolMass / digestionSpeed;

        // Vystup
        System.out.printf("Doba odbouravani: %f hodin\n", duration);
    }
}
