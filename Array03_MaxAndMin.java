public class Array03_MaxAndMin {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 5, 40, 15};

        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int number : numbers) {

            if (number > maximum) {
                maximum = number;
            }

            if (number < minimum) {
                minimum = number;
            }
        }

        System.out.println("Maximum value: " + maximum);
        System.out.println("Minimum value: " + minimum);
    }
}
