import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSNValidator {
    public static boolean isValidSSN(String input) {
        // Regex pattern for SSN format: 3 digits - 2 digits - 4 digits
        String ssnPattern = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        Pattern pattern = Pattern.compile(ssnPattern);
        Matcher matcher = pattern.matcher(input);

        return matcher.find();
    }

    public static void main(String[] args) {
        String text1 = "My SSN is 123-45-6789.";
        String text2 = "My SSN is 123456789.";

        System.out.println("\"123-45-6789\" is " + (isValidSSN(text1) ? "valid" : "invalid"));
        System.out.println("\"123456789\" is " + (isValidSSN(text2) ? "valid" : "invalid"));
    }
}
