/*
Write a program to calculate the area of a triangle
area=(b*h)/2
*/
package java_homework_reshma;

import java.util.Scanner;

public class Programme8 {
    public void m() {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter value of base: ");
        double b = a.nextInt();

        System.out.println("Please enter value of height: ");
        Scanner c = new Scanner(System.in);
        double h = c.nextInt();
        double triangle = ((b * h) / 2);
        System.out.println("Area of triangle is: " + triangle);
        a.close();
        c.close();
    }

    public static void main(String[] args) {
        Programme8 t = new Programme8();
        t.m();
    }
}
