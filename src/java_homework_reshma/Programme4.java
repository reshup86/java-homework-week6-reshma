/*
Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
*/
package java_homework_reshma;

public class Programme4 {
    int a = 5;
    int b = 10; // a and b are instance variables
    static String c= "Good";
    static String d = "Morning"; // c and d are static variables
    //Instance method
    public void m1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    //Static method
    public static void m2(){
        Programme4 programme4 = new Programme4();
        System.out.println(programme4.a);
        System.out.println(programme4.b);
        System.out.println(c);
        System.out.println(d);
    }
    //Main method
    public static void main (String []args){
        Programme4 programme4 = new Programme4();
        programme4.m1();
        m2();
    }
}
