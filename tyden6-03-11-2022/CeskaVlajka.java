import java.util.Scanner;

public class CeskaVlajka {
    public static void main(String[] args) {
        // Vstupni promenne.
        int w, h;

        // Zpracovani vstupu.
        Scanner s = new Scanner(System.in);
        System.out.print("Zadejte vysku: ");
        h = s.nextInt();
        System.out.print("Zadejte sirku: ");
        w = s.nextInt();

        // Zpracovani a vystup.
        for (int i = 0; i < w; i++) System.out.print("\033[30m#"); System.out.println("\033[0m");
        for (int i = 0; i <= h / 2 - 2; i++) {
            System.out.print("\033[30m#\033[0m");
            for (int j = 0; j < i; j++) System.out.print("\033[34m#\033[0m");
            System.out.print("\033[30m#\033[0m");
            for (int j = i; j < w - 3; j++) System.out.print("\033[97m#");
            System.out.println("\033[30m#");
        }
        System.out.print("\033[30m#");
        for (int i = 0; i < h / 2 - 1; i++) System.out.print("\033[94m#\033[0m");
        System.out.print("\033[30m#");
        for (int i = 0; i < w - h / 2 - 2; i++) System.out.print("\033[30m#");
        System.out.println("#\033[0m");
        for (int i = h / 2 - 2; i >= 0; i--) {
            System.out.print("\033[30m#\033[0m");
            for (int j = 0; j < i; j++) System.out.print("\033[34m#\033[0m");
            System.out.print("\033[30m#\033[0m");
            for (int j = i; j < w - 3; j++) System.out.print("\033[91m#");
            System.out.println("\033[30m#");
        }
        for (int i = 0; i < w; i++) System.out.print("\033[30m#"); System.out.println("\033[0m");
    }
}
