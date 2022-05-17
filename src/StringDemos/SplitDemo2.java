package StringDemos;

public class SplitDemo2 {

    public static void main(String[] args) {

        String str = "Hey Baby you are so lovely";
        // print only the words that ends with 'y'

       String[] stArr = str.split(" ");

        for (int i=0;i<stArr.length;i++)
        {
            int l =stArr[i].length();

            if(stArr[i].charAt(l-1)=='y')
                System.out.println(stArr[i]);
        }

    }
}
