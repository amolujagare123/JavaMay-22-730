package InheritanceDemos.SuperDemo;


class Animal
{
    String color = "Black";
    void eat()
    {
        System.out.println("Animal eat");
    }
}
class Dog extends Animal
{
    String color = "White";
    void eat()
    {
        System.out.println("Dog eat");
    }
    void printColor()
    {
        System.out.println("color="+color);
        System.out.println("color="+super.color);
        eat();
        super.eat();
    }
}

class BabyDog extends Dog
{
    String color = "gray";
    void eat()
    {
        System.out.println("BabyDog eat");
    }
    void babyDogMethod()
    {
        System.out.println("color="+color);//gray
        System.out.println("color="+super.color); // White
        eat(); // BabyDog eat
        super.eat(); // Dog Eat
    }
}


public class TestSuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
       // d.printColor();

        BabyDog bd = new BabyDog();
        bd.babyDogMethod();
    }
}
