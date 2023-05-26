package java_week2_homework;
import java.util.Scanner;

/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/

public class Programme_16_AddTwoBinary {

    public static void main(String[] args) {
        System.out.println("welcome to java program to add two binary numbers");

        //Scanner declaration for reading input from consol.
        Scanner Scanner = new Scanner(System.in);
        System.out.println("please enter first binary number");
        String first = Scanner.nextLine();
        System.out.println("please enter second binary number");
        String second = Scanner.nextLine();
        String addition = addTwoBinaryNumbers(first, second);
        System.out.println("the addition of two binary number is : " + addition);
        //closing the Scanner object.
        Scanner.close();
    }

    //adding the twwo Binary Numbers
    public static String addTwoBinaryNumbers(String first, String second){

    int b1 = Integer.parseInt(first, 2);
    int b2 = Integer.parseInt(second, 2);
    int sum = b1 + b2;
    return Integer.toBinaryString(sum);
    }
}
