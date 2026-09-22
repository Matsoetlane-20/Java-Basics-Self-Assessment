public class Q48_CapitalizeWords {

    public static void main(String[] args) {

        String sentence = "hello WORLD java PROGRAMMING";

        String[] words = sentence.toLowerCase().split(" ");

        String result = "";

        for (String word : words) {

            String firstLetter = word.substring(0, 1).toUpperCase();
            String remainingLetters = word.substring(1);

            result = result + firstLetter + remainingLetters + " ";
        }

        System.out.println(result.trim());
    }
}
