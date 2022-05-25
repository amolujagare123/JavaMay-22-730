package Methods;

import ClassNConstructors.MyClass;

public class MethodDemo1 {

    void printMyClassObject(MyClass obj)
    {
        System.out.println("===== Object is printing =====");
        obj.display();
    }


    void addition(int a,int b)
    {
        int c = 0;
        c = a + b;
        System.out.println(c);
    }

    void sampleMethod(int x, char c, String str,double d)
    {
        System.out.println("x="+x);
        System.out.println("c="+c);
        System.out.println("str="+str);
        System.out.println("d="+d);
    }

    void printMyArray(int[] ar)
    {
        System.out.println("===== Array is printing =====");
        for (int i=0;i<ar.length;i++)
            System.out.println(ar[i]);
    }

    void printTwoDArray(String[][] myTwoDArray)
    {
        System.out.println("===== Two D Array is printing =====");

        for (int i=0;i<myTwoDArray.length;i++)
        {
            for (int j=0;j<myTwoDArray[0].length;j++)
            {
                System.out.print(myTwoDArray[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        MethodDemo1 ob = new MethodDemo1();

        ob.addition(34,12);
        ob.sampleMethod(21,'g',"amol",12.4);

        int[] x = {11,22,44,66,88,90};

        ob.printMyArray(x);


        String[][] stArr = {
                {"ayushee","deepthi","dipali"} ,
                {"divya","gajanan","madhavi"} ,
                {"nidhi","pallavi","prachi"} ,
                {"priyanka","puja","shivani"},
        };

        ob.printTwoDArray(stArr);

        MyClass myClass = new MyClass();

        myClass.a =90;
        myClass.d=23.34;

        ob.printMyClassObject(myClass);

    }
}
