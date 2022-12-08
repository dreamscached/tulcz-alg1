import java.time.YearMonth;
import java.util.Scanner;

public class DnuVMesici {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Zadej rok: ");
        int year = s.nextInt();
        System.out.print("Zadej cislo mesice: ");
        int month = s.nextInt();

        YearMonth ymo = YearMonth.of(year, month);
        System.out.printf("Dnu v mesici %d roku %d: %d", month, year, ymo.lengthOfMonth());
    }
}
