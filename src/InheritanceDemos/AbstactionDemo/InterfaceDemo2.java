package InheritanceDemos.AbstactionDemo;

public interface InterfaceDemo2 {

    void run();
    void start();
    void display();
}

interface AnotherInterface
{
    void display();
}

class ChildInt implements InterfaceDemo2,AnotherInterface
{


    public void run() {
        System.out.println("run");
    }


    public void start() {
        System.out.println("start");
    }

    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {

        InterfaceDemo2 ob1 = new ChildInt();
        ob1.display();

        AnotherInterface ob2 = new ChildInt();
        ob2.display();
    }
}
