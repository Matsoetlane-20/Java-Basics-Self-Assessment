public class Array08_CountEvenOdd {

    public static void main(String[] args) {

        int[] numbers = {7, 2, 4, 1, 3, 6, 8};

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
