public class BadWordCensor {
    public static void main(String[] args) {
        String sentence = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};

        for (String badWord : badWords) {
            // Use regex with word boundaries to replace whole words only, case-insensitive
            sentence = sentence.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        System.out.println(sentence);
    }
}
