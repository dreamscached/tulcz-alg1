import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Zadej N: ");
        int n = s.nextInt();
        BigInteger f = factorial(n);
        System.out.printf("Factorial %d je %s.", n, f.toString());
    }

    private static BigInteger factorial(int n) {
        BigInteger f = BigInteger.ONE;
        for (int i = 2; i <= n; i++) f = f.multiply(BigInteger.valueOf(i));
        return f;
    }
}
