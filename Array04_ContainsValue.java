public class Array04_ContainsValue {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int value = 30;

        boolean found = false;

        for (int number : numbers) {

            if (number == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(value + " is found in the array.");
        } else {
            System.out.println(value + " is not found in the array.");
        }
    }
}
