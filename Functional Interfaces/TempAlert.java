import java.util.function.Predicate;

public class TempAlert {
    public static void main(String[] args) {
        Predicate<Double> highTemp = t -> t > 40;
        double temp = 42.5;
        if (highTemp.test(temp)) System.out.println("Alert! High temperature");
    }
}
