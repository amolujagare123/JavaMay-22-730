package ArraysDemo;

public class IntTwoDDemoString {

    public static void main(String[] args) {
        String[][] a = {
                {"ayushee","deepthi","dipali"} ,
                {"divya","gajanan","madhavi"} ,
                {"nidhi","pallavi","prachi"} ,
                {"priyanka","puja","shivani"},
                 };

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
