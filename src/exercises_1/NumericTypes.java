/* Numeric types:
Write a program to calculate the area of a rectangle and print the answer to the console.
You should prompt the user for the dimensions. (What data types should the dimensions be?)
*/


package exercises_1;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Double width, height;
        Scanner in;

        in = new Scanner(System.in);

        System.out.println("What is the rectangle width?");
        width = in.nextDouble();

        System.out.println("What is the rectangle height?");
        height = in.nextDouble();

        System.out.println("The area of your rectangle is: " + (width * height));
    }

}
