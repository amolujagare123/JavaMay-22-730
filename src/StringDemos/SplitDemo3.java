package StringDemos;

public class SplitDemo3 {

    public static void main(String[] args) {

        String str = "Hey Baby you are so lovely";
        // print only the words that ends with 'y'

       String[] stArr = str.split(" ");

        for (int i=0;i<stArr.length;i++)
        {
            if(stArr[i].endsWith("y"))
                System.out.println(stArr[i]);
        }

    }
}
