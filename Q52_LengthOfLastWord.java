public class Q52_LengthOfLastWord {

    public static void main(String[] args) {

        String sentence = "The length of last word";

        String[] words = sentence.split(" ");

        String lastWord = words[words.length - 1];

        int length = lastWord.length();

        System.out.println("Original String: " + sentence);
        System.out.println("Length of the last word of the above string: " + length);
    }
}
