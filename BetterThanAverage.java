import java.util.*;
import java.util.stream.IntStream;

class BetterThanAverage {
    /*static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
        List<int[]> list = Collections.singletonList(classPoints);

        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }*/

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return IntStream.of(classPoints).average().getAsDouble() < yourPoints;
    }

    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] {2, 3}, 5));
        System.out.println(betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        System.out.println(betterThanAverage(new int[] {100, 90}, 11));
    }
}