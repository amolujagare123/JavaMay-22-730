package ArraysDemo;

public class TwoDimentionalArrayDemo {

    public static void main(String[] args) {

        int[][] a = new int[5][3];

        a[0][0] = 34;
        a[0][1] = 14;
        a[0][2] = 24;

        a[1][0] = 31;
        a[1][1] = 32;
        a[1][2] = 33;

        a[2][0] = 84;
        a[2][1] = 94;
        a[2][2] = 44;

        a[3][0] = 74;
        a[3][1] = 37;
        a[3][2] = 94;

        a[4][0] = 31;
        a[4][1] = 14;
        a[4][2] = 32;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i=0;i<5;i++) // row
        {
            for (int j=0;j<3;j++) // col
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
