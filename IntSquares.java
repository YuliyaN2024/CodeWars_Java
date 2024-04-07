import java.util.stream.IntStream;

public class IntSquares {
    public static void main(String[] args) {
        
    }
    public static int squareSum(int[] n)
    {
        IntStream intStream = IntStream.of(n);
        int r = intStream.reduce(0, (x, y) -> x + y * y);
        return r;
    }
}