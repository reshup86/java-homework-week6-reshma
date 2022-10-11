/*
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
*/
package java_homework_reshma;

import java.util.Scanner;

public class Programme13 {
    public void p13() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter number 1: " );
        int x = a.nextInt();
        System.out.println("Enter number 2: " );
        int y = a.nextInt();
        System.out.println("Enter number 3: ");
        int z = a.nextInt();
        System.out.println("Average is: "+ ((x+y+z)/3));
        a.close();
    }
    public static void main (String []args){
        Programme13 programme13 = new Programme13();
        programme13.p13();
    }
}
