package InheritanceDemos;

class Bird
{
    void fly()
    {
        System.out.println("fly");
    }
}

class Crow extends Bird
{
    void crowColor()
    {
        System.out.println("Black");
    }
}

class Sparrow extends Bird
{
    void sparrowColor()
    {
        System.out.println("Yellow");
    }
}

class Peacock extends Bird
{
    void peacockColor()
    {
        System.out.println("Violet");
    }
}


public class TestHierachicalInheritance {

    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();

        Crow c =new Crow();
        c.crowColor();
        c.fly();

        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();

        Peacock p = new Peacock();
        p.peacockColor();
        p.fly();
    }

}
