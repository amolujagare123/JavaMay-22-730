package InheritanceDemos.Polymorphism;

public class BaseClass {

     void myMethod()
    {
        System.out.println("BaseClass myMethod");
    }
}

class ChildClass extends BaseClass
{
     void myMethod()
    {
        System.out.println("ChildClass myMethod");
    }
    // when you are overriding a method you should not
    //decrease the scope/accessibility of method

    public static void main(String[] args) {

      /*  ChildClass ob = new ChildClass();
        ob.myMethod();*/

        BaseClass ob2 = new ChildClass(); // upcasting
        // create the object reference of parent class and assign
        // the child class object to it
        ob2.myMethod();

       // BaseClass ob3 = new BaseClass();

    }


}
