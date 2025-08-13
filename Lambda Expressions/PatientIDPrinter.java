import java.util.*;

public class PatientIDPrinter {
    public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("PID001", "PID002", "PID003");

        // Method reference instead of lambda
        patientIds.forEach(System.out::println);
    }
}
