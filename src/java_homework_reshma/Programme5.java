/*
Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
*/
package java_homework_reshma;

public class Programme5 {
    int a=20;
    int b=10;
    public void addition (){
        System.out.println("Addition: " + (a+b));
    }
    public void subtraction(){
        System.out.println("Subtraction: " + (a-b));
    }
    public static void multiplication(){
        Programme5 m = new Programme5();
        System.out.println("Multiplication: " + (m.a * m.b));
    }
    public static void division(){
        Programme5 d = new Programme5();
        System.out.println("Division: " + (d.a/d.b));
    }
    public static void main (String []args){
        System.out.println("---------------------");
        System.out.println("     Calculator      ");
        System.out.println("---------------------");
        Programme5 programme5 = new Programme5();
        programme5.addition();
        programme5.subtraction();
        multiplication();
        division();
    }
}
