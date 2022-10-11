/*
Write a Java program that takes a number as input and prints its
multiplication table up to 10
*/
package java_homework_reshma;
import java.util.Scanner;
public class Programme10 {
    public void a(){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = n.nextInt();
        System.out.println(x + "*" + "1" + "=" + x*1);
        System.out.println(x + "*" + "2" + "=" + x*2);
        System.out.println(x + "*" + "3" + "=" + x*3);
        System.out.println(x + "*" + "4" + "=" + x*4);
        System.out.println(x + "*" + "5" + "=" + x*5);
        System.out.println(x + "*" + "6" + "=" + x*6);
        System.out.println(x + "*" + "7" + "=" + x*7);
        System.out.println(x + "*" + "8" + "=" + x*8);
        System.out.println(x + "*" + "9" + "=" + x*9);
        System.out.println(x + "*" + "10" + "=" + x*10);
        n.close();
    }
    public static void main (String []args){
        Programme10 p = new Programme10();
        p.a();
    }
}
