public class Q54_FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String text = "google";

        int result = -1;

        for (int i = 0; i < text.length(); i++) {

            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                result = i;
                break;
            }
        }

        System.out.println(
            "Index of first non-repeating character in '" 
            + text + "' is: " + result
        );
    }
}
