import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " - Price: $" + price + ", Rating: " + rating + ", Discount: " + discount + "%";
    }
}

public class ProductSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1000, 4.5, 10),
            new Product("Phone", 600, 4.7, 20),
            new Product("Tablet", 300, 4.2, 15)
        );

        // Sort by discount
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));

        products.forEach(System.out::println);
    }
}
