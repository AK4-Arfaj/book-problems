// Status: Completed
// Satisfaction Rating: 10/10
/*
        (*M)
        Description:
            Build a calculator app that detects if the operands or operator is improper, inform the user. Do it in
            two ways: One: using exceptions. Two: Not using exceptions.

        Process:
            -

        Comments:
            - [A] Used String.format()
            - [A] I actually now know how to iterate over a string, and check if all of its contents are numbers.
            - [A] Used String.join(), used .charAt(), and .contains()

        Skills Required:
            - Exception handling
            - String manipulation
                - Iterating over its elements
                - Joining an array's elements in one string
            - Taking input from users

        Tricks Used:
            - Nothing terribly special.
*/
package BookProblems;

import java.util.Scanner;
import java.util.InputMismatchException;
//     With Exception Handler
// Ok, thank god, I now understand the Scanner class a bit more. So, there is one line buffer, like a strip.
// When empty, and you request it to get the next token(e.g. next(), nextInt(),etc.), it will wait for the
// user to put something in, otherwise, it uses what it has. So, you can always clear the buffer by moving
// to the next line, scanner.nextLine()

public class Prob_12_1_M {

    public static void main(String [] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to this awesome calculator. Please enter in an expression: ");
        String[] expression = {scan.next(), scan.next(), scan.next()};
        boolean[] areValidOperands = new boolean[2];
        try {
            String answer = calculate(expression, areValidOperands).toString();
            System.out.println(String.format("%s = %s", String.join(" ", expression), answer));

        }
        catch (NumberFormatException nfe) {
            if (!areValidOperands[0])
                System.out.println(String.format("Wrong input; Improper operand: %s", expression[0]));
            else if (!areValidOperands[1])
                System.out.println(String.format("Wrong input; Improper operand: %s", expression[2]));

        }
        catch (InputMismatchException ime) {
            System.out.println(String.format("Wrong input; Improper operator: %s", expression[1]));
        }

    }

    public static Double calculate(String[] expression, boolean[] validOperandsTracker) throws NumberFormatException, InputMismatchException {
        Double operand1 = Double.parseDouble(expression[0]);
        validOperandsTracker[0] = true;
        Double operand2 = Double.parseDouble(expression[2]);
        validOperandsTracker[1] = true;
        Double result;
        switch (expression[1]) {
                // Wrote this with unreachable code in mind (very important)
                case "+" -> result = operand1 + operand2;
                case "-" -> result = operand1 - operand2;
                case "*" -> result = operand1 * operand2;
                case "/" -> result = operand1 / operand2;
                default -> throw new InputMismatchException();
            }
            return result;
    }

    // Without Exception Handler
//    public static void main(String [] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter in a mathematical expression: ");
//        String[] expression = new String[]{scan.next(), scan.next(), scan.next()};
//        Double answer = calculateWE(expression);
//        System.out.println(String.format("%s = %.2f", String.join(" ", expression), answer));
//    }
//    public static Double calculateWE(String[] expression) {
//        Double answer = 0.0;
//        boolean foundImproper = false;
//        for (int i = 0; i < expression.length; i += 2){
//            for (int j = 0; j < expression[i].length(); j++)
//                if (!"1234567890".contains("" + expression[i].charAt(j))) {
//                    System.out.println("Improper operand: " + expression[i]);
//                    foundImproper = true;
//                    System.exit(1); // Don't really got much choice here
//                }
//            if (foundImproper)
//                break;
//        }
//        Double operand1 = Double.parseDouble(expression[0]);
//        Double operand2 = Double.parseDouble(expression[2]);
//        switch(expression[1]) {
//            case "+":
//                answer = operand1 + operand2;
//                break;
//            case "-":
//                answer = operand1 - operand2;
//                break;
//            case "*":
//                answer = operand1 * operand2;
//                break;
//            case "/":
//                answer = operand1 / operand2;
//                break;
//            default:
//                System.out.println("Improper operator: " + expression[1]);
//                System.exit(1);
//        }
//        return answer;
//
//    }

}