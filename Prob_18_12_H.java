package BookProblems;
public class Prob_18_12_H {
    public static void main(String [] args) {
        reverseDisplay("CHEM101 MAJOR 2 EXAM");
    }
    public static void reverseDisplay(String value) {
        reverseDisplay(value, value.length() - 1);
    }
    public static void reverseDisplay(String value, int high) {
        if (high >= 0) { // Base case is when high becomes less than 0, cuz it will not be possible to call the recursive method agaain
            System.out.print(value.charAt(high));
            reverseDisplay(value, high - 1);
        }
    }
}


