package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadOperation2 {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(" we are reading a file");


       // try {
            FileInputStream fis = new FileInputStream("d:\\amol1.txt");
       /* } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        System.out.println("file read operation successful");

        System.out.println("End of the program");
    }
}
