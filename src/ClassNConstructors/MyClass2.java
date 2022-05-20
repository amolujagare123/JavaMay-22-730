package ClassNConstructors;

public class MyClass2 {

    int  a;
    double d;
    char c;
    String str ;  // data members

    MyClass2()
    {

    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass2 ob = new MyClass2();
        ob.display();
    }

}
