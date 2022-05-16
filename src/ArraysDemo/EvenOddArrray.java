package ArraysDemo;

public class EvenOddArrray {

    public static void main(String[] args) {
        int [] a = {455,837,888,900,233,766,344,999,655,111};;

        for (int i = 0; i < a.length; i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]+ " is a Even number");
            }
            else
                System.out.println(a[i]+ " is a Odd number");

        }
    }
}
