package java_week2_homework;
import java.util.Scanner;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */
public class Programme_13_AverageOfNumbers {

    public static void main(String[] args) {

        //Scanner declaration for reading input from console.
        Scanner Scanner = new Scanner(System.in);
        System.out.print("enter the first number : ");
        double x = Scanner.nextDouble();
        System.out.print("enter the second number : ");
        double y = Scanner.nextDouble();
        System.out.print("enter the third number : ");
        double z = Scanner.nextDouble();
        averageOfThreeNumbers(x,y,z);
        //closing the Scanner.
        Scanner.close();
    }

    //calculation the average of three numbers.
    public static void averageOfThreeNumbers(double a, double b, double c){
        double average = (a + b + c);
        System.out.print("The average of " + a + " , " + b + " and " + c + " is : " + average);
    }

}
