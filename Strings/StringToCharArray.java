import java.util.Scanner;

public class StringToCharArray {
    

    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = scanner.next();
        

        char[] chars1 = getCharacters(text);
        
   
        char[] chars2 = text.toCharArray();
        

        boolean areEqual = compareArrays(chars1, chars2);
        
        System.out.println("\nResults:");
        System.out.println("Original text: " + text);
        System.out.println("Characters using user-defined method: " + new String(chars1));
        System.out.println("Characters using toCharArray(): " + new String(chars2));
        System.out.println("Are the results equal? " + areEqual);
        
        scanner.close();
    }
} 