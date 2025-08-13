import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}
