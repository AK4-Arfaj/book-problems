package BookProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob_11_13_M {
    public static void main(String[] mathRECIsOverForeverWohoooooo) {
        Scanner scanner = new Scanner(System.in);  /**  Read user input from the console ;)  */
        final int NUM_OF_INTEGERS = 10;
        ArrayList<Integer> nums = new ArrayList<Integer>();

        System.out.println("Ayy, this program removes duplicates found in a list of numbers.");
        System.out.print("So, enter " + NUM_OF_INTEGERS + " integers: ");

        for (int i = 0; i < NUM_OF_INTEGERS; i++) {
            nums.add(scanner.nextInt());
        }
        removeDuplicate(nums);

        System.out.print("The distinct integers are ");
        for (Integer integer: nums)
            System.out.print(integer + " ");
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {  /**  Main loop, go through all the numbers  */
            for (int j = i + 1; j < list.size(); j++) {  /**  Secondary loop, go through all the numbers after primary number  */
                if (list.get(j) == list.get(i)) {  /**  Duplicate found!  */
                    list.remove(j);
                    j--;             /**  Very funny, as it might cause misconception; will remove(j) remove an Integer obj = j or  */
                                     /**  whatever is at index j? The answer is the latter. Why? j is an int! And yes, ints can  */
                                     /**  fill in to become an Integer, but when given two choices(the two overloaded methods),  */
                                     /**  then the closest(int) will be taken.  */
                }
            }
        }
    }
}