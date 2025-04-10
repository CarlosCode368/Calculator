//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Create an instance of a scanner object
        Scanner myScanner = new Scanner(System.in);
// get two numbers, add them together, and display the sum
        //get desired operator +-*/
        System.out.print("Enter a single operator.\nEx: '+','-','*','/':\n");
        String operator = myScanner.next(); //get string

        System.out.print("Enter first number: ");
        int num1 = myScanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = myScanner.nextInt();

        int result = 0;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        }

            System.out.println("The result is " + result);
        }
    }

