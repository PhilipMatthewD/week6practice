/*import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Please Enter A Number:");

            double num1 = input.nextDouble();
            System.out.println("Enter another number:");
            double num2 = input.nextDouble();
            System.out.println(num1 + " " + num2);
            add(num1, num2);
            divide(num1, num2);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data Type Loser");
        } catch(ArithmeticException e){
            System.out.println("rofl");
        }
    }

    static void add(double a, double b) {
        System.out.println(a + b);
    }

    static void divide(double a, double b) {
        System.out.println(a / b);
    }
}
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] aray = new int[]{1,2,3};
        try {
            System.out.println("Access element: " + aray[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(":C");
        }catch(Exception e){
            System.out.println(":'C");
        }
    }
}*/
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    try {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter age to see if eligible to vote");
        int age = input.nextInt();
        validate(age);
    }catch(InputMismatchException e){
        System.out.println("You suck at reading, enter the age as in a number.");
    }

    }

    static void validate(int age){
        if(age<18)
            System.out.println("You are ineligible to vote");
        else
            System.out.println("You are eligible to vote");
    }
}
