package java_week2_homework;
import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {

        //Scanner declaration for reading input from console.
        Scanner Scanner = new Scanner(System.in);
        System.out.println("please enter the length of the triangle : ");
        int lenght = Scanner.nextInt();
        System.out.println("please enter the height of the triangle : ");
        int height = Scanner.nextInt();
        areaOfTriangle(height, lenght);
        //closing Scanner object.
        Scanner.close();

    }

    //Calculating the area of the triangle with no returntype with parameter method.
    public static void areaOfTriangle(int height,int length){
        int area = (length * height) / 2;
        System.out.println("the area of triangle is : " + area);
    }
}
