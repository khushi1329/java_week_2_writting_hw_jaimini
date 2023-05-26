package java_week2_homework;
import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */

public class Programme_15_SwapTheValue {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console.
        Scanner Scanner = new Scanner(System.in);
        System.out.print("enter the first variable value : ");
        int first = Scanner.nextInt();
        System.out.print("enter the second variable value : ");
        int second = Scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue(first, second);
        // closing the scanner object
        Scanner.close();
    }

    //Swapping the value of variables
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);
    }
}

