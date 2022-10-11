/*
Write a Java program to swap two variables
*/
package java_homework_reshma;

import java.util.Scanner;

public class Programme15 {
    public void p15(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number x: ");
        int x= s.nextInt();
        System.out.println("Enter number y:" );
        int y=s.nextInt();
        int z = y;
        y=x;
        System.out.println("------Swap numbers------");
        System.out.println("Number x: " +z);
        System.out.println("Number y: " +y);
        s.close();
    }
    public static void main(String []args){
        Programme15 programme15=new Programme15();
        programme15.p15();
    }
}
