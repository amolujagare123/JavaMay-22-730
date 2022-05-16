package ArraysDemo;

public class IntTwoDDemo {

    public static void main(String[] args) {
        int[][] a = { {1,1,1,0} ,
                {2,2,2,0} ,
                {3,3,3,0} ,
                {4,4,4,0},
                {5,5,5,6} };

        int row = a.length;
        int col = a[4].length; // 4

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
