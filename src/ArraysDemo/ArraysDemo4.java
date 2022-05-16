package ArraysDemo;

public class ArraysDemo4 {

    public static void main(String[] args) {

        String[] a = new String[5];

        a[0] = "amol";
        a[1] = "avinash";
        a[2] = "ayushi";
        a[3] = "deepthi";
        a[4] = "dipali";

        System.out.println("size="+a.length);


        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
