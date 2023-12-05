package BookProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob_11_12_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++)
            numbers.add(scanner.nextDouble());
        System.out.println(sum(numbers));
    }
    public static double sum(ArrayList<Double> list) {
        double total = 0;
        for (Double value: list)
            total += value;
        return total;
    }
}