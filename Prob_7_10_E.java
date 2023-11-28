package BookProblems;
import java.util.Scanner;

public class Prob_7_10_E {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter ten numbers please: ");
        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextDouble();
        int maxValIdx = indexOfLargestElement(array);
        System.out.printf("The largest element %f is at index %d.", array[maxValIdx], maxValIdx);
    }

    public static int indexOfLargestElement(double[] array) {
        int maxValIdx = 0;
        for (int i = 1; i < array.length; i++) // We start at 1 because we already have 0 as the initial value of maxValIdx
            if (array[maxValIdx] <= array[i])
                maxValIdx = i;
        return maxValIdx;
    }
}
