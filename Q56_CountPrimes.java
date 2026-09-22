public class Q56_CountPrimes {

    public static void main(String[] args) {

        int count = 0;

        for (int number = 2; number <= 1235; number++) {

            boolean isPrime = true;

            for (int divisor = 2; divisor < number; divisor++) {

                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println("Number of prime numbers less than or equal to 1235: " + count);
    }
}
