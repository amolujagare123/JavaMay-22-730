package StringDemos;

public class ConversionDemo {

    public static void main(String[] args) {

        String s1 = "12";
        String s2 = "22";

        System.out.println(s1+s2);

        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);

        System.out.println(a1+a2);

        String s3 ="12.34";
        String s4 ="52.14";

        System.out.println(s3+s4);

        Double d1 = Double.parseDouble(s3);
        Double d2 = Double.parseDouble(s4);
        System.out.println(d1+d2);

        Float f1 = Float.parseFloat(s3);
        Float f2 = Float.parseFloat(s4);
        System.out.println(f1+f2);

        String s5 = "false";

        boolean result = Boolean.parseBoolean(s5);

        if (result)
            System.out.println("result is true");
        else
            System.out.println("result is false");


        String s6 = "t";

      //  char c = Character.parseChar(s6); // not working
     //   char c = s6;  // not working
       char c = s6.charAt(0);
    }
}
