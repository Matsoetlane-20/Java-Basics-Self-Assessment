public class Array06_ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            reversed[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println("Original array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println("Reversed array:");

        for (int number : reversed) {
            System.out.print(number + " ");
        }
    }
}
