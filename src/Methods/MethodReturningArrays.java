package Methods;

public class MethodReturningArrays {

    double[] getMyDoubleArray()
    {
        double[] d = {12.3,23.4,34.5,45.6,56.7,67.8};
        return d;
    }

    String[][] getMyTwoDStringArray()
    {
        String[][] stArr = {
                {"ayushee","deepthi","dipali"} ,
                {"divya","gajanan","madhavi"} ,
                {"nidhi","pallavi","prachi"} ,
                {"priyanka","puja","shivani"},
        };

        return stArr;
    }

    public static void main(String[] args) {

        MethodReturningArrays ob = new MethodReturningArrays();
        double[] myDoubleArray = ob.getMyDoubleArray();

        for (int i=0;i<myDoubleArray.length;i++)
            System.out.println(myDoubleArray[i]);


        String[][] myStringArr = ob.getMyTwoDStringArray();

        for (int i=0;i<myStringArr.length;i++)
        {

            for (int j=0;j<myStringArr[0].length;j++)
            {
                System.out.print(myStringArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
