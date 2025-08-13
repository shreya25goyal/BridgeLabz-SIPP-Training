interface PaymentMethod {
    void pay(double amount);
}

class UPI implements PaymentMethod {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via UPI"); }
}

class CreditCard implements PaymentMethod {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via Credit Card"); }
}
