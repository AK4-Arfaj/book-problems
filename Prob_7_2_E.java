package BookProblems;

import java.util.Scanner;
public class Prob_7_2_E {
    public static void main(String [] prob_7_2_E) {
        Scanner input = new Scanner(System.in);
        int[] ints = new int[11];
        System.out.print("Enter in 10 integers and then one more integer that you want to compare the 10 integers to: ");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = input.nextInt();
        }

        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] > ints[10])
                System.out.println(ints[i] + " is greater than " + ints[10]);
            else if (ints[i] < ints[10])
                System.out.println(ints[i] + " is less than " + ints[10]);
            else
                System.out.println(ints[i] + " is equal to " + ints[10]);
        }
    }
}