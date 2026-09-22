public class Q44_SameRightmostDigit {

    public static void main(String[] args) {

        int first = 23;
        int second = 45;
        int third = 13;

        int firstDigit = first % 10;
        int secondDigit = second % 10;
        int thirdDigit = third % 10;

        boolean result = (firstDigit == secondDigit)
                || (firstDigit == thirdDigit)
                || (secondDigit == thirdDigit);

        System.out.println(result);
    }
}
