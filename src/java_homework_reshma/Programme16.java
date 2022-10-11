/*
Write a Java program to add two binary numbers.
        Input Data:
        Input first binary number: 10
        Input second binary number: 11
        Expected Output:
        Sum of two binary numbers: 101
*/
package java_homework_reshma;

import java.util.Scanner;
public class Programme16 {
    public void p16(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two binary numbers");
        String a = s.nextLine();
        String b = s.nextLine();

        int x= Integer.parseInt(a, s.radix());
        int y = Integer.parseInt(b, s.radix());
        int sum = x+y;
        System.out.println("The sum of binary number is: ");
        System.out.println(Integer.toBinaryString(sum));
        s.close();
    }
    public static void main(String[]args){
        Programme16 programme16 = new Programme16();
        programme16.p16();
    }
}
