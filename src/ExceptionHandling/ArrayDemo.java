package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 10;
            a[1] = 13;
            a[2] = 20;
            a[3] = 11;
            a[4] = 50;
            a[5] = 111;
        }
        catch (Exception e)
        {
            System.out.println("inside catch block");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("end of the program");

    }
}
