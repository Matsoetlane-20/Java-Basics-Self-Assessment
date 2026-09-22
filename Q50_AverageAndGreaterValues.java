public class Q50_AverageAndGreaterValues {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 17, 7, 25, 3, 100};

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);

        System.out.println("Numbers greater than average:");

        for (int number : numbers) {
            if (number > average) {
                System.out.println(number);
            }
        }
    }
}
