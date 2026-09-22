import java.nio.charset.Charset;

public class Q30_AvailableCharsets {

    public static void main(String[] args) {

        for (String charsetName : Charset.availableCharsets().keySet()) {

            System.out.println(charsetName);
        }
    }
}
