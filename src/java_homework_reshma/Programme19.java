/*
Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.
*/
package java_homework_reshma;

import java.util.Scanner;
public class Programme19 {
    public void p19(){
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter string in UPPERCASE: ");
        String uc= s.nextLine();
        String lc= uc.toLowerCase();
        System.out.println("The lowecase string is: " +lc);
        s.close();
    }
    public static void main(String[]args){
        Programme19 programme19= new Programme19();
        programme19.p19();
    }
}
