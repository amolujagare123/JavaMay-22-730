package JavaBasic;

public class FizzBuzzProblem {

    public static void main(String[] args) {


       for (int i=1;i<=30;i++)
        {
            if(i%3 == 0 && i%5 == 0)
              System.out.println(i+" FizzBuzz");
            else if(i%5 ==0)
                System.out.println(i+" Buzz");
            else if(i%3 == 0)
                System.out.println(i+" Fizz");
            else
                System.out.println(i);

        }



    }
}
