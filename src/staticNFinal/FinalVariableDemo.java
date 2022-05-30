package staticNFinal;

public class FinalVariableDemo {

   final int speed = 200;

    void change()
    {
      //  speed = 300;
    }

    public static void main(String[] args) {

        FinalVariableDemo ob = new FinalVariableDemo();

        ob.change();

        System.out.println(ob.speed);
    }
}
