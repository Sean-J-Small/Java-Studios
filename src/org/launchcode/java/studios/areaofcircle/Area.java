package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {

    public static double getArea (double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a value for the radius: ");
        double input = -1;
        while(!in.hasNextDouble() || (input = in.nextDouble()) < 0) {
            System.out.println("Please enter a positive value.");
            in.nextLine();
        }
        System.out.println(getArea(input));

    }
}
