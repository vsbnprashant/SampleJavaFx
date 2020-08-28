package learning3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class BindingOperationDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        TextField textField = new TextField();
        Label lblLength = new Label();

        lblLength.textProperty().bind(
                textField.textProperty()
                        .length()   // this length returns IntegerBinding, not just an integer
                        .asString() // so you can keep observing it and use binding methods
        );

        HBox root = new HBox(20, textField, lblLength);
        root.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(root, 200, 100));
        stage.show();
    }
}
