package learning2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class II_BasicControls extends Application {

    @Override
    public void start(Stage stage){
    Button btn = new Button();
    btn.setText("Say Hello World");
    btn.setGraphic(new Circle(10));
    btn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {

            System.out.println("Hello World!");
        }
    });

        StackPane spane = new StackPane();
        spane.getChildren().add(btn);
       Scene scene  = new Scene(spane,400, 400);
       stage.setScene(scene);
       stage.show();



    }
}
