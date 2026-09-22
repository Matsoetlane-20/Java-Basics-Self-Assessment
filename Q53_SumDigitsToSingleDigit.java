public class Q53_SumDigitsToSingleDigit {

    public static void main(String[] args) {

        int number = 25;

        while (number >= 10) {

            int sum = 0;

            while (number > 0) {
                sum = sum + number % 10;
                number = number / 10;
            }

            number = sum;
        }

        System.out.println(number);
    }
}
