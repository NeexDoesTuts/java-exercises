package org.launchcode.java.studios;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        double r;
        double area;
        Scanner in;


        do {
            in = new Scanner(System.in);
            System.out.println("Enter a valid radius:");
            r = in.nextDouble();
        } while (r <= 0);

        area = pi * r * r;
        System.out.println("The area of a circle of radius " + r + " is: " + area);
    }
}
