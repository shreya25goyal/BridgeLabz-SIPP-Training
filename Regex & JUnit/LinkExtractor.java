import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class LinkExtractor {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Regex to match URLs starting with http:// or https://
        String urlPattern = "(https?://[\\w\\-\\.]+(?:\\.[a-z]{2,})+[/\\w\\-\\.?&=%#]*)";

        Pattern pattern = Pattern.compile(urlPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> links = new ArrayList<>();

        while (matcher.find()) {
            links.add(matcher.group());
        }

        System.out.println(String.join(", ", links));
    }
}
