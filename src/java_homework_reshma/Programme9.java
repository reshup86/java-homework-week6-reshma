/*
Write a program to convert the upper case to lower case
*/
package java_homework_reshma;

import java.util.Scanner;

public class Programme9 {
    public void p9(){
        Scanner sc= new Scanner(System.in); // declare scanner
        String s=""; //Declaring string
        System.out.print("Enter any string: ");
        s=sc.nextLine();
        String lc="",uc=""; //declaring objects to store lowercase and uppercase strings
        lc= s.toLowerCase(); //loweracse
        uc= s.toUpperCase(); //uppercase
        System.out.println("Lower Case String: "+lc);
        System.out.println("Upper Case String: "+uc);
        sc.close();
    }
    public static void main (String []args){
        Programme9 x = new Programme9();
        x.p9();
    }
}
