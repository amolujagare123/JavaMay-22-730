package StringDemos;

public class SplitDemo {

    public static void main(String[] args) {

        String str = "Java is a Programming language";

       // String[] stArr = str.split(" ");
      //  String[] stArr = str.split("i");
        String[] stArr = str.split("ng");

        for (int i=0;i<stArr.length;i++)
        {
            System.out.println(stArr[i]);
        }

    }
}
