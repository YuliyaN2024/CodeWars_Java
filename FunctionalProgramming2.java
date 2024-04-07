import java.util.function.ToDoubleFunction;

public class FunctionalProgramming2 {
    public static ToDoubleFunction<Triangle> f = p -> {
        double area = (double) (p.base * p.height) /2;
        p.setArea(area);
        return area;
    };

    public static void main(String[] args) {
        Triangle t = new Triangle(5, 10);
        double d = FunctionalProgramming2.f.applyAsDouble(t);
        System.out.println(t.getArea());
    }
}
   