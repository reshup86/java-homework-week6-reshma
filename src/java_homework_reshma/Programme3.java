/*
Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
*/

package java_homework_reshma;

public class Programme3 {
    String a = "Reshma"; // a is instance variable
    static String b = "Panchal"; // b is static variable

    // Instance Method
    public void m1() {
        System.out.println(a);
        System.out.println(b);
    }
    //Static Method
    public static void m2() {
        Programme3 xyz = new Programme3();
        System.out.println(xyz.a);
        System.out.println(b);
    }
    //Main method
    public static void main(String[] args) {
        Programme3 programme3 = new Programme3();
        programme3.m1();
        m2();
    }
}
