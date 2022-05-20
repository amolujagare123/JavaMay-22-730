package ClassNConstructors;

public class MyClass {

    int  a;
    double d;
    char c;
    String str ;  // data members

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        /*int x ;
        x = 10;
        System.out.println(x);*/

        MyClass ob = new MyClass();

        ob.a = 19;
        ob.d = 45.6;
        ob.c = 'g';
        ob.str = "amol";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a= 89;
        ob2.d = 9.9;
        ob2.c = 'h';
        ob2.str="java";
        ob2.display();
    }

}
