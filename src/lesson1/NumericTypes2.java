/*Numeric types:
Write a program that asks a user for the number of miles
they have driven and the amount of gas they've consumed
(in gallons), and print their miles-per-gallon.
*/
package lesson1;
import java.util.Scanner;

public class NumericTypes2 {
    public static void main(String[] args) {
        Double miles, gallons;
        Scanner in;

        in = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        miles = in.nextDouble();
        System.out.println("How many gallons have you used?");
        gallons = in.nextDouble();

        System.out.println("That is " + (miles / gallons) + " miles per gallon.");
    }

}
