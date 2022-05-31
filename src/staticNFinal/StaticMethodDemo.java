package staticNFinal;

public class StaticMethodDemo {
    int rno;
    String name;
    public static String college = "ITC";

    void display() // non static method - static and nonstatic both allowed
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name); // non static member allowed
        System.out.println("college="+college); // static member allowed
        staticMethod1(); // static method allowed
        nonstaticMethod();  // non static method allowed
    }

    void nonstaticMethod()
    {
        System.out.println("nonstaticMethod");
    }

    public static void staticMethod1()
    {
        System.out.println("staticMethod1");
    }

    public static void staticMethod2() // static allows only static members
    {
        int a = 10;
        System.out.println("staticMethod2");
        System.out.println("college="+college); // static member is allowed
        //System.out.println("name="+name); // non static member is not allowed
        staticMethod1(); // static method is allowed
      //  display(); //non static method is not allowed

    }

    public static void main(String[] args) {

   /*     StaticMethodDemo ob1 = new StaticMethodDemo();
        StaticMethodDemo ob2 = new StaticMethodDemo();

        ob1.staticMethod1();
        ob1.staticMethod2(); // static method can be called using class object
*/
        StaticMethodDemo.staticMethod1();
        StaticMethodDemo.staticMethod2();// static method can be called using class name

    }

}
