/*
Write a java programme using the following steps:
1.1 Declare two instance variable
1.2 Declare one instance method
1.3 Call both instance variables into the instance method inside the print statement
1.4 Declare the main method
1.5 Call the above instance method into the Main method and Run the programme
 */
package java_homework_reshma;

public class Programme1 {
    int a = 5; //a and b are 2 variables
    int b = 10;

    //instance method
    public void m1() {
        System.out.println(a);
        System.out.println(b);
    }

    //main method
    public static void main(String[] args) {
        Programme1 xyz = new Programme1();
        System.out.println(xyz.a);
        System.out.println(xyz.b);
    }

}
