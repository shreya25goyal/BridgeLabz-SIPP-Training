import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class CurrencyExtractor {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Regex pattern to match:
        // 1) Dollar sign followed by digits and optional decimals
        // 2) Or standalone decimal numbers (e.g., 10.50)
        String currencyPattern = "(\\$\\d+(\\.\\d{1,2})?)|(\\b\\d+\\.\\d{1,2}\\b)";

        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> values = new ArrayList<>();

        while (matcher.find()) {
            values.add(matcher.group());
        }

        System.out.println(String.join(", ", values));
    }
}
