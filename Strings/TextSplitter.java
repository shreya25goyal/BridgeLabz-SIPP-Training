import java.util.Scanner;

public class TextSplitter {
    
 
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
    

    public static String[] splitText(String text) {

        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        int startIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(startIndex, i);
                wordIndex++;
                startIndex = i + 1;
            }
        }
        words[wordIndex] = text.substring(startIndex);
        
        return words;
    }
    

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
   
        String[] words1 = splitText(text);
        
  
        String[] words2 = text.split(" ");
 
        boolean areEqual = compareArrays(words1, words2);
        
        System.out.println("\nResults:");
        System.out.println("Original text: " + text);
        System.out.println("\nWords using user-defined method:");
        for (String word : words1) {
            System.out.println(word);
        }
        System.out.println("\nWords using split() method:");
        for (String word : words2) {
            System.out.println(word);
        }
        System.out.println("\nAre the results equal? " + areEqual);
        
        scanner.close();
    }
} 