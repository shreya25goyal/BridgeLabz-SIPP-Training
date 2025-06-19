import java.util.Scanner;

public class StringLength {
    

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        

        int length1 = findLength(text);
   
        int length2 = text.length();
        
        System.out.println("\nResults:");
        System.out.println("Length using user-defined method: " + length1);
        System.out.println("Length using length() method: " + length2);
        System.out.println("Are the lengths equal? " + (length1 == length2));
        
        scanner.close();
    }
} 