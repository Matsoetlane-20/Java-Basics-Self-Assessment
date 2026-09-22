import java.util.Scanner;

public class Q32_Password {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input your password: ");
        String password = input.nextLine();

        System.out.println("Your password is: " + password);

        input.close();
    }
}
