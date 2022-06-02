package ExceptionHandling;

public class ThrowDemo {

    public void checkNumber(int n)
    {
        if(n>=1 && n<=10)
            System.out.println("We are safe");

        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {

        int a = 11;

        System.out.println("number is a ="+a);
        System.out.println("lets check number");

        ThrowDemo ob = new ThrowDemo();
        ob.checkNumber(a);

        System.out.println("program executed");
        System.out.println("End of the program ");

    }
}
