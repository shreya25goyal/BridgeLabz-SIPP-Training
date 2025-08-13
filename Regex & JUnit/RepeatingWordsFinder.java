import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.LinkedHashSet;

public class RepeatingWordsFinder {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        // Regex to find consecutive repeated words (case insensitive)
        String patternStr = "\\b(\\w+)\\b\\s+\\b\\1\\b";

        Pattern pattern = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Use LinkedHashSet to maintain insertion order and avoid duplicates
        LinkedHashSet<String> repeatingWords = new LinkedHashSet<>();

        while (matcher.find()) {
            repeatingWords.add(matcher.group(1).toLowerCase());
        }

        System.out.println(String.join(", ", repeatingWords));
    }
}
