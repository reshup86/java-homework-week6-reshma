/*
Write a Java program to print the area and perimeter of a rectangle.
            Test Data:
            Width = 5.5 Height = 8.5
            Expected Output:
            Area is 5.6 * 8.5 = 47.60
            Perimeter is 2 * (5.6 + 8.5) = 28.20
*/
package java_homework_reshma;

import java.util.Scanner;
public class Programme14 {
    public void p(){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Width: ");
        double w = a.nextDouble();
        System.out.println("Enter Height: ");
        double h = a.nextDouble();
        double x = (w*h);
        System.out.println("Area is: " + x);
        double y = 2*(w+h);
        System.out.println("Perimeter is: " + y);
        a.close();
    }
    public static void main(String []args){
        Programme14 programme14= new Programme14();
        programme14.p();
    }
}
