package ClassNConstructors.pack1;

public class Java2 extends Java1{

    int b2;

    public static void main(String[] args) {
        Java1 ob = new Java1();

        ob.a = 19;
        ob.d = 45.6;
      //  ob.c = 'g';
        ob.str = "amol";
        ob.display();

        Java2 ob2 = new Java2();
        ob2.a = 19;
        ob2.d = 45.6;
      //   ob2.c = 'g';
        ob2.str = "amol";
        ob2.display();
    }
}
