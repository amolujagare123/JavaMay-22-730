package ClassNConstructors;

public class MyClass5 {

    int  a;
    double d;
    char c;
    String str ;  // data members

    MyClass5(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c=  c;
        this.str = str;
        display();
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass5 ob = new MyClass5(11,22.22,'g',"text value");

       // ob.display();



    }

}
