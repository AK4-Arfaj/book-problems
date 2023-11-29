package BookProblems;
public class Prob_7_1_M {

    public static void main(String [] go) {
        // Instantiate a Scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Get student grades
        System.out.print("Enter the number of students: ");
        int numOfGrades = input.nextInt();
        int[] grades = new int[numOfGrades];
        System.out.print("Enter " + numOfGrades + " scores: ");

        // Fill the array
        for (int i = 0; i < grades.length; i++) grades[i] = input.nextInt();


        // Find Highest grade (max int value)
        int highestGrade = grades[0];
        for (int i = 1; i < grades.length; i++)
            if (highestGrade < grades[i])
                highestGrade = grades[i];

        // Determine the letter grade of each student
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student " + i + " score is " + grades[i] + " is ");
            if (grades[i] >= highestGrade - 5)
                System.out.println("A");
            else if (grades[i] >= highestGrade - 10)
                System.out.println("B");
            else if (grades[i] >= highestGrade - 15)
                System.out.println("C");
            else if (grades[i] >= highestGrade - 20)
                System.out.println("D");
            else
                System.out.println("F");
        }
    }
}
