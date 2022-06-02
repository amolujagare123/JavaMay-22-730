package ExceptionHandling;

public class DivisionDemo {

    public static void main(String[] args) {

        int a  = 10;
        int b = 1;

        int c = 0;

        try {
            c = a / b ;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("inside ArithmeticException catch block");
            System.out.println("inside catch block");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("inside catch block");
            System.out.println("inside Exception catch block");

            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch (Throwable e)
        {
            System.out.println("inside catch block");
            System.out.println("inside Throwable catch block");

            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        finally {
            System.out.println("inside finally");
        }



        System.out.println("c="+c);

        System.out.println("end of the program");
    }
}
