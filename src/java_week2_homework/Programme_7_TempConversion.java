package java_week2_homework;
import java.util.Scanner;
/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console.
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the temperature in fehrenheit : ");
        float temp = Scanner.nextFloat();
        //object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);
        //closing the scanner object.
        Scanner.close();

    }

    //Temperature conversion method.
    public void convertTempToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5 / 9);
        System.out.println("the temperature " + temp +"fahernheat is equal to " + c + "degree celsius");
    }
}
