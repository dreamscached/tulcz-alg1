import java.util.Scanner;

public class Uloha35_Jehlan {
    public static void main(String[] args) {
        // Vstupni promenne.
        int n;

        // Zpracovani vstupu.
        Scanner s = new Scanner(System.in);
        System.out.print("Zadejte N: ");
        n = s.nextInt();

        // Zpracovani a vystup.
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print(' ');
            for (int j = 0; j < i; j++) {
                System.out.print("*" + (j + 1 < i ? " " : ""));
            }
            System.out.println();
        }
    }
}
