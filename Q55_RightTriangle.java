public class Q55_RightTriangle {

    public static void main(String[] args) {

        int a = 6;
        int b = 9;
        int c = 12;

        boolean result = (a * a + b * b == c * c);

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
