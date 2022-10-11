/*
Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r)
*/

package java_homework_reshma;

import java.util.Scanner;
public class Programme6 {
    public void a() {
        Scanner r = new Scanner(System.in);
        System.out.println("Please enter any radius value of the circle: ");
        double a =r.nextDouble();
        System.out.println (3.14 * a * a); // PI value is fixed 3.14
        r.close();
    }
public static void main (String []args){
        Programme6 programme6 = new Programme6();
        programme6.a();
}
}