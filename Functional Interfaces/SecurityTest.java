interface SecurityUtils {
    static boolean isStrongPassword(String pwd) {
        return pwd.length() >= 8 && pwd.matches(".*\\d.*") && pwd.matches(".*[A-Z].*");
    }
}

public class SecurityTest {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("Pass1234")); // true
    }
}
