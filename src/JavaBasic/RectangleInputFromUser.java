package JavaBasic;

import java.util.Scanner;

public class RectangleInputFromUser {

    public static void main(String[] args) {

        int length ;
        int breadth ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle=");
        length = sc.nextInt();
        System.out.println("Enter breadth of rectangle=");
        breadth = sc.nextInt();


        int area;
        int perimeter;

        area = length * breadth ;  // 300

        perimeter = 2*(length + breadth); // 70

        System.out.println("Area="+area);
        System.out.println("Perimeter="+perimeter);

    }
}
