import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 📘 StackPane Layout
 *
 * StackPane stacks all child nodes on top of each other in a single stack.
 * - The *last added* node appears on top (like a stack of cards).
 * - Nodes are centered by default, but you can adjust alignment if needed.
 *
 * 🔸 Common Use-Cases:
 * - Displaying a label or button on top of an image or shape.
 * - Creating overlays (e.g., loading spinners or modals).
 * - Temporarily showing/hiding UI elements (toggling visibility).
 */
public class StackPaneLayout extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("StackPane Layout Example");

        // Creating a StackPane layout container
        StackPane stackPane = new StackPane();

        // Adding multiple buttons to StackPane
        stackPane.getChildren().addAll(
                new Button("Bottom Button"),  // This is added first → goes to the bottom
                new Button("Top Button")      // This is added last → appears on top
        );

        /**
         * 🔍 Observation:
         * Since both buttons are stacked and centered,
         * the "Top Button" will completely cover the "Bottom Button".
         *
         * You can reveal lower layers using:
         * - Transparency in top nodes (e.g., semi-transparent overlays)
         * - setTranslateX/Y() to move nodes around
         * - Visibility toggling: node.setVisible(true/false)
         */

        Scene scene = new Scene(stackPane, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}