package BookProblems;

public class Prob_18_1_M {
    public static void main(String [] args) {
        String word1 = "abcc";
        String word2 = "abcd";
        boolean areThey = areAnagrams(word1, word2);
        System.out.println(String.format("%s and %s are %s anagrams!",
                                       word1, word2, areThey? "\b": "not"));
    }
    public static boolean areAnagrams(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        char word1Char0 = word1.charAt(0);
        int word2CharIdx = word2.indexOf(word1Char0);
        if (word2CharIdx == -1)
            return false;
        else {
            if (word1.length() == 1)
                return true;
            word1 = word1.substring(1);
            word2 = word2.substring(0, word2CharIdx) + word2.substring(word2CharIdx + 1);
            return areAnagrams(word1, word2);
        }
    }
}

