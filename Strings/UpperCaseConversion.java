import java.util.Scanner;

public class UpperCaseConversion {
    
  
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
            
                result.append((char)(c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    
 
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        
     
        String upperCase1 = convertToUpperCase(text);
        
      
        String upperCase2 = text.toUpperCase();
        

        boolean areEqual = compareStrings(upperCase1, upperCase2);
        
        System.out.println("\nResults:");
        System.out.println("Original text: " + text);
        System.out.println("Uppercase using charAt(): " + upperCase1);
        System.out.println("Uppercase using toUpperCase(): " + upperCase2);
        System.out.println("Are the results equal? " + areEqual);
        
        scanner.close();
    }
} 