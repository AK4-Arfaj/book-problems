package BookProblems;

public class Rectangle {
    double width = 1.0;
    double height = 1.0;
    Rectangle() {
        // Like, do nothing
    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return this.width * this.height;
    }

    double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }
}
