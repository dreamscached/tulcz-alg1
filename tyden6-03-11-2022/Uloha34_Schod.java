import java.util.Scanner;

public class Uloha34_Schod {
    public static void main(String[] args) {
        // Vstupni promenne.
        int n;

        // Zpracovani vstupu.
        Scanner s = new Scanner(System.in);
        System.out.print("Zadejte N: ");
        n = s.nextInt();

        // Zpracovani a vystup.
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*' + (j + 1 < i ? ' ' : '\n'));
            }
        }
    }
}
