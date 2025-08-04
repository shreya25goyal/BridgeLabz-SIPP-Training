public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String target = "Java";
        String replacement = "Python";

        String result = "";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                words[i] = replacement;
            }
            result += words[i] + " ";
        }

        System.out.println("Modified Sentence: " + result.trim());
    }
}
