interface PaymentProcessor {
    void process(double amount);
    default void refund(double amount) {
        System.out.println("Default refund of ₹" + amount);
    }
}
