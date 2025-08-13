import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class CapitalizedWordsExtractor {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Regex to match words starting with a capital letter followed by lowercase letters
        String patternStr = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> capitalizedWords = new ArrayList<>();

        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }

        // Join and print words separated by commas
        System.out.println(String.join(", ", capitalizedWords));
    }
}
