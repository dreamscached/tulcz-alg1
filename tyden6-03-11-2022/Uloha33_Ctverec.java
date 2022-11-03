import java.util.Scanner;

public class Uloha33_Ctverec {
    public static void main(String[] args) {
        // Vstupni promenne.
        int n, m;

        // Zpracovani vstupu.
        Scanner s = new Scanner(System.in);
        System.out.print("Zadejte N: ");
        n = s.nextInt();
        System.out.print("Zadejte M: ");
        m = s.nextInt();

        // Zpracovani a vystup.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*" + (j + 1 < n ? " " : "\n"));
            }
        }
    }
}
