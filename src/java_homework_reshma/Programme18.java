/*
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
package java_homework_reshma;

import java.util.Scanner;

public class Programme18 {
    public void p18(){
        Scanner s = new Scanner(System.in);
        System.out.println("Input first number: ");
        int n1= s.nextInt();
        System.out.println("Input second number: ");
        int n2= s.nextInt();
        System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
        System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
        System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
        System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
        System.out.println(n1 + " mod " + n2 + "=" + (n1%n2));
        s.close();
    }
    public static void main(String []args){
        Programme18 programme18 = new Programme18();
        programme18.p18();
    }
}
