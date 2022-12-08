import java.util.Arrays;

public class ArrayTools {
    public static int sum(int[] array) {
//        return Arrays.stream(array).sum();
        int s = 0;
        for (int j : array) s += j;
        return s;
    }
}
