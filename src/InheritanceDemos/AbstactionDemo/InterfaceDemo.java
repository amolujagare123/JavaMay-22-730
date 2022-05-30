package InheritanceDemos.AbstactionDemo;

public interface InterfaceDemo {

    void run();
    void start();
    static void display()
    {
        System.out.println("display");
    }
    default void display2()
    {
        System.out.println("display1");
    }

    private void display1()
    {
        System.out.println("display1");
    }
}

class ChildInterface implements InterfaceDemo
{
    public void run()
    {
        System.out.println("run");
    }

    public void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();

        ob.run();
        ob.start();
        InterfaceDemo.display();
        ob.display2();
    }

}
