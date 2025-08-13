public class ExceptionPropagationExample {

    // method1: throws ArithmeticException
    public static void method1() {
        int result = 10 / 0;  // This will throw ArithmeticException
    }

    // method2: calls method1
    public static void method2() {
        method1();  // Exception is not caught here, so it propagates
    }

    // main: calls method2 and handles the exception
    public static void main(String[] args) {
        try {
            method2();  // This will receive the propagated exception
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
