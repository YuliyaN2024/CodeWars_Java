
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class AdderFactory {
    public static IntUnaryOperator create(int addTo) {
        return (int x) -> x + addTo;
    }

    public static void main(String[] args) {
        System.out.println(AdderFactory.create(1).applyAsInt(4));
    }
}
