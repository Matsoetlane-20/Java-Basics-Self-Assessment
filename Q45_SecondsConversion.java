public class Q45_SecondsConversion {

    public static void main(String[] args) {

        int totalSeconds = 86399;

        int hours = totalSeconds / 3600;

        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;

        int seconds = remainingSeconds % 60;

        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
