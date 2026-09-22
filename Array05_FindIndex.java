public class Array05_FindIndex {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int value = 30;

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == value) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(value + " is found at index: " + index);
        } else {
            System.out.println(value + " is not found in the array.");
        }
    }
}
