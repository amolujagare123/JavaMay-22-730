package InheritanceDemos.AbstactionDemo;

public abstract class AbstractBase {

    abstract void run();
    abstract void start();

    void display()
    {
        System.out.println("display");
    }

    public static void main(String[] args) {
       // AbstractBase ob = new AbstractBase(); // not possible
    }
}

class ChildAbstract extends AbstractBase
{

    void run()
    {
        System.out.println("run");
    }

    void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        AbstractBase ob = new ChildAbstract();
        ob.run();
        ob.start();
        ob.display();
    }

}
