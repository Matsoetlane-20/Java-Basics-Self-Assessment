public class Q51_PartitionEvenOdd {

    public static void main(String[] args) {

        int[] numbers = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};

        int[] result = new int[numbers.length];

        int position = 0;

        // Put even numbers first
        for (int number : numbers) {
            if (number % 2 == 0) {
                result[position] = number;
                position++;
            }
        }

        // Put odd numbers after the even numbers
        for (int number : numbers) {
            if (number % 2 != 0) {
                result[position] = number;
                position++;
            }
        }

        System.out.println("Original array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println("After partition:");

        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}
