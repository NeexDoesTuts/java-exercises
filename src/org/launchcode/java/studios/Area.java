package org.launchcode.java.studios;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        double r;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter a radius:");
        r = in.nextDouble();

        area = pi * r * r;

        if (r <= 0 ) {
            System.out.println("The radius cannot be negative or zero. At least not on Planet Earth.");
            System.out.print("Goodbye!");
        } else {
            System.out.println("The area of a circle of radius " + r + " is: " + area);
        }
    }
}
