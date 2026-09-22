import java.io.File;

public class Q35_FileSize {

    public static void main(String[] args) {

        File file1 = new File("/home/students/abc.txt");
        File file2 = new File("/home/students/test.txt");

        System.out.println("File size of abc.txt: " + file1.length() + " bytes");
        System.out.println("File size of test.txt: " + file2.length() + " bytes");
    }
}
