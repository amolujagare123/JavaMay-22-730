public class WrapperClassDemo {
    public static void main(String[] args) {

        int a = 5;
        System.out.println("a="+a);

        Integer ii = new Integer(a);// wrapping/ boxing
        Integer ii1 = new Integer(5);

        System.out.println("ii="+ii);
        System.out.println("ii1="+ii1);

        Integer ii2 = 5;// auto wrapping/ auto boxing
        Integer ii3 = a;
        System.out.println("ii2="+ii2);

        System.out.println("ii3="+ii3);



    }
}
