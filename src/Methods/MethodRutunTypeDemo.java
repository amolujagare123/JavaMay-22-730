package Methods;

public class MethodRutunTypeDemo {

    int myIntMethod()
    {
        int x =89;
        return x;
    }

 /*   int calculations(int a, int b ,int c)
    {
        int res1 = a+b;
        int res2 = ( res1 -c ) * a;
        return res2;
    }*/

    // Whenever a method returns a value ,
    // it actually holds the value that it returns

    public static void main(String[] args) {

        int a ;
        a = 11;
        int x = a ;
      //  System.out.println(a);

        MethodRutunTypeDemo ob = new MethodRutunTypeDemo();


        ob.myIntMethod();

        int b = ob.myIntMethod();
        // Whenever a method returns a value ,
        // it actually holds the value that it returns

        System.out.println("b="+b);

        System.out.println(ob.myIntMethod());


      //  System.out.println(ob.calculations(11,-10,10));

    }
}
