public class NullPointerExceptionDemo {
    
  
    public static void generateException() {
        String text = null;

        System.out.println("Length of null string: " + text.length());
    }
    

    public static void handleException() {
        try {
            String text = null;
           
            System.out.println("Length of null string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
} 