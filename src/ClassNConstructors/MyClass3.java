package ClassNConstructors;

public class MyClass3 {

    int  a;
    double d;
    char c;
    String str ;  // data members

    MyClass3()
    {
        a = 10;
        d = 20.20;
        c= 'n';
        str = "selenium";
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass3 ob = new MyClass3();
        ob.display();

       /* ob.a = 19;
        ob.d = 45.6;
        ob.c = 'g';
        ob.str = "amol";

        ob.display();*/
    }

}
