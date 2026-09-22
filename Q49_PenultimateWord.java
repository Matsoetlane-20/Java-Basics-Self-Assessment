public class Q49_PenultimateWord {

    public static void main(String[] args) {

        String sentence = "The quick brown fox jumps over the lazy dog";

        String[] words = sentence.split(" ");

        String penultimateWord = words[words.length - 2];

        System.out.println("Penultimate word: " + penultimateWord);
    }
}
