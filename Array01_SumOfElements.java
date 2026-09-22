public class Array01_SumOfElements {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
