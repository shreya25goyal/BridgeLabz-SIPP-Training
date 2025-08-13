import java.util.function.Function;

public class LengthCheck {
    public static void main(String[] args) {
        Function<String, Integer> lengthCalc = s -> s.length();
        String msg = "Hello, Java!";
        System.out.println("Length: " + lengthCalc.apply(msg));
    }
}
