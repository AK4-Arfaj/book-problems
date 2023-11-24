package BookProblems;
public class Prob_18_9_M {
    public static void main(String[] args) {
       reverseDisplay("Hello World!");
       System.out.println();
       reverseDisplay("Pikachu");
    }

    public static void reverseDisplay(String value) {
        if (value.length() != 0) { // If it is zero, the call stack bids this method call farewell.
            reverseDisplay(value.substring(1));
            System.out.print(value.charAt(0));
        }
    }
}
