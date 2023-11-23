package BookProblems;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Prob_18_6_M {
    public static void main(String[] prob_2) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the array size: ");
            int arrSize = input.nextInt();
            int[] x = new int[arrSize];
            System.out.print("Enter the limits: ");
            int a = input.nextInt();
            int b = input.nextInt();
            randomFillSortedArray(x, 0, arrSize - 1, a, b);
            System.out.println(Arrays.toString(x));
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input!");
        } catch (Exception e) {
            System.out.println("Oh no! An unexpected problem occured");
            e.printStackTrace();
        }

    }

    public static void randomFillSortedArray(int[] x, int l, int r, int a, int b) {
        if (l <= r) {
            x[l] = (int)((Math.random()) * (b-a+1)) + a;
            randomFillSortedArray(x, l + 1, r, a, b);
        }
        else {
            selectionSort(x, 0); // Start tracker from the beginning of the array
        }

    }
    // The selection sort itself as I know it needs to be recursive 💀
    public static void selectionSort(int[] x, int tracker) {
        if (tracker < x.length - 1) { // Let the tracker take on all the positions of the array
            int movingTracker = tracker + 1; // The moving tracker compares the element of focus to other elements
            // Finding smallest value in the rest of the array
            int min = x[movingTracker]; // value
            int minPos = movingTracker; // position
            for (int i = movingTracker + 1; i < x.length; i++) {
                if (x[i] < min) {
                    min = x[i];
                    minPos = i;
                }
            }
            if (min < x[tracker]) {
                x[minPos] = x[tracker];
                x[tracker] = min;
            }
            selectionSort(x, tracker + 1);
        }
    }
}
