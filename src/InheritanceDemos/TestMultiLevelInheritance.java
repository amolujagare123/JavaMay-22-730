package InheritanceDemos;

class Animal
{
    void eat()
    {
        System.out.println("eat");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("bark");
    }
}

class BabyDog extends Dog
{
    void weep()
    {
        System.out.println("weep");
    }
}


public class TestMultiLevelInheritance {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.eat();
        d.bark();

        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
