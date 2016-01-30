import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista ring, mille suurust saab kasutaja Slideriga muuta
 */
public class JavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox stack = new VBox();
        Scene scene = new Scene(stack,   150, 150);
        primaryStage.setScene(scene);

        Circle ring = new Circle(30);

        Slider slider = new Slider();

        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(40);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
            System.out.println("Uus väärtus on: " + uusVaartus.intValue());
            ring.setRadius(uusVaartus.intValue());
        });

        stack.getChildren().add(slider);
        stack.getChildren().add(ring);



        primaryStage.show();
    }
}
