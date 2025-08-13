import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
            "Emergency: Code Blue",
            "Reminder: Take medication",
            "Info: Cafeteria menu updated",
            "Emergency: Fire alarm"
        );

        // Filter only emergency alerts
        Predicate<String> emergencyFilter = alert -> alert.startsWith("Emergency");

        alerts.stream()
              .filter(emergencyFilter)
              .forEach(System.out::println);
    }
}
