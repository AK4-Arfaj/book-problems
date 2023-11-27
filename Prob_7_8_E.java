package BookProblems;

import java.util.Scanner;

public class Prob_7_8_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nums = new double[10];
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextInt();
        System.out.println(average(nums));
    }
    public static int average(int[] array) {
        int sum = 0;
        for (int num: array)
            sum += num;
        return sum / array.length;
    }
    public static double average(double[] array) {
        double sum = 0;
        for (double num: array)
            sum += num;
        return sum / array.length;
    }
}