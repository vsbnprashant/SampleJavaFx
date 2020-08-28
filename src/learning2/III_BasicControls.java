package learning2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class III_BasicControls extends Application {

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

        VBox root = new VBox(5);
        root.setPadding(new Insets(20));
        Button btnShort = new Button("short");
        root.getChildren().addAll(btn, btnShort, new Button("wide-wide-wide"));

       Scene scene  = new Scene(root,400, 400);
       stage.setScene(scene);
       stage.show();



    }
}
