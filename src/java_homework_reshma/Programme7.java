/*
Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C)
*/
package java_homework_reshma;

import java.util.Scanner;
public class Programme7 {
    public void p() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter degree in Fahrenheit: ");
        int f = s.nextInt();
        int c = ((f - 32) * 5 / 9);
        System.out.println("Degree in Celsius is: " + c);
        s.close();
    }

    public static void main(String[] args) {
        Programme7 programme7 = new Programme7();
        programme7.p();
    }
}
