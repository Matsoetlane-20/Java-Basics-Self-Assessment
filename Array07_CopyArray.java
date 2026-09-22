public class Array07_CopyArray {

    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};

        int[] copied = new int[original.length];

        for (int i = 0; i < original.length; i++) {

            copied[i] = original[i];
        }

        System.out.println("Original array:");

        for (int number : original) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println("Copied array:");

        for (int number : copied) {
            System.out.print(number + " ");
        }
    }
}
