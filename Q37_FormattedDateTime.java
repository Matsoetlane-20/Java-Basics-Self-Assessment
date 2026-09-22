import java.text.SimpleDateFormat;
import java.util.Date;

public class Q37_FormattedDateTime {

    public static void main(String[] args) {

        Date currentDate = new Date();

        SimpleDateFormat format =
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");

        String formattedDate = format.format(currentDate);

        System.out.println("Current date and time: " + formattedDate);
    }
}
