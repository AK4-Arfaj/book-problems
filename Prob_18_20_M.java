// !!!! PUT YOUR PACKAGE NAME HERE !!!!
// import Classes
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Scanner;

public class Prob_18_20_M extends Application {
    // Define Panes
    StackPane pane = new StackPane(); // Defining it here so every method in this class can access it <3

    @Override
    public void start(Stage stage) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for window dimensions
        System.out.println("Howdy, we like it texan-style roun' here champ!"); // خرابيط، معرف شمعنى هالكلام أصلًا
        System.out.print("How wide would you like the window to be(please be reasonable)? ");
        int WINDOW_DIMENSION = scanner.nextInt();

        // Edit pane properties
        pane.setMinHeight(WINDOW_DIMENSION);
        pane.setMinWidth(WINDOW_DIMENSION);


        // Draw circles
        int radius = (WINDOW_DIMENSION - 20 - 2) / 2;
        drawCircle(radius);

        // Create scene, set the scene, show the stage
        Scene scene = new Scene(pane);
        stage.setTitle("Prob_18_20_M" + " | Window Dimension: " + WINDOW_DIMENSION + "px");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void drawCircle(int radius) {
        if (radius > 0) {
            Circle circle = new Circle(radius);
            StackPane.setAlignment(circle, Pos.CENTER);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.TRANSPARENT);
            circle.setStrokeWidth(1);
            pane.getChildren().add(circle);
            drawCircle(radius - 10 - 2);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}