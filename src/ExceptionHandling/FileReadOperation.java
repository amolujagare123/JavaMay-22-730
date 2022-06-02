package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadOperation {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(" we are reading a file");

        try {
            FileInputStream fis = new FileInputStream("d:\\amol1.txt");
        }
        catch (Exception e)
        {
            System.out.println("inside catch block");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        System.out.println("file read operation successful");

        System.out.println("End of the program");
    }
}
