package learning2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Shear;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
// chapter2/other/Transformations.java
public class Transformations extends Application {

    TilePane root = new TilePane(50,50);


    // service method to make similar rectangles
    private Rectangle addRect() {
        // here we create two rectangles:
        // one for transformation
        Rectangle rect = new Rectangle(20, 100, Color.DARKGRAY);
        // and another to demonstrate original
        // untransformed rectangle bounds
        Rectangle rectOrig = new Rectangle(20, 100);
        rectOrig.setFill(Color.TRANSPARENT);
        rectOrig.setStroke(Color.BLACK);

        StackPane pane = new StackPane(rect, rectOrig);
        root.getChildren().add(pane);

        return rect;
    }


    @Override
    public void start(Stage primaryStage) {
        // rotate transformation
        Rectangle rect1 = addRect();
        rect1.setRotate(30);

        // translate transformation
        Rectangle rect2 = addRect();
        rect2.setTranslateY(20);

        // scale transformation
        Rectangle rect3 = addRect();
        rect3.setScaleX(2);

        // shear transformation
        Rectangle rect4 = addRect();
        rect4.getTransforms().add(new Shear(0.3, 0));

        // combining two transformations
        Rectangle rect5 = addRect();
        Transform t1 = new Shear(0.3, 0);
        Transform t2 = new Rotate(-15);
        rect5.getTransforms().add(t1.createConcatenation(t2));

        // adding all transformed rectangles to the scene
        root.setPadding(new Insets(50));
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();
    }
}