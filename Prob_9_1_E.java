package BookProblems;

public class Prob_9_1_E {
    public static void main(String[] howManyHoursWillISleepTonightSadFace) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.printf("About Rectangle 1:\nWidth: %.2f\nHeight: %.2f\nArea: %.2f\nPerimeter: %.2f\n",
                rectangle1.width,
                rectangle1.height,
                rectangle1.getArea(),
                rectangle1.getPerimeter());
        System.out.printf("About Rectangle 2:\nWidth: %.2f\nHeight: %.2f\nArea: %.2f\nPerimeter: %.2f\n",
                rectangle2.width,
                rectangle2.height,
                rectangle2.getArea(),
                rectangle2.getPerimeter());
    }
}
