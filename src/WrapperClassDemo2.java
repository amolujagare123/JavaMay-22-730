public class WrapperClassDemo2 {
    public static void main(String[] args) {


        Integer ii = new Integer(5);

        int a = ii.intValue(); // unboxing / unwrapping

        System.out.println("a="+a);

        int a1 = 5;// auto unboxing / auto unwrapping
        System.out.println("a1="+a1);


    }
}
