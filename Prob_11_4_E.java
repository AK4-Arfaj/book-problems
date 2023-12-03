package BookProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob_11_4_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int entry = 1; // Anything other than sentinel zero is ok
        System.out.print("Enter a list of ints: ");
        while (entry != 0) {
            entry = scanner.nextInt();
            list.add(entry);
        }
        Integer maxNum = max(list);
        System.out.println(maxNum);
    }
    public static Integer max(ArrayList<Integer> list) {
        int maxAt = 0; // Initially
        for (int i = 0; i < list.size(); i++)
            if (list.get(i) > list.get(maxAt))
                maxAt = i;
        return list.get(maxAt);
    }
}