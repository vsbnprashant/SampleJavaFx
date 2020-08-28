package learning3;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class BasicBinding extends Application{

    @Override
    public void start(Stage stage){
        Label lblWidth = new Label();


       lblWidth.textProperty().bind(stage.widthProperty().asString());

        stage.setScene(new Scene(new StackPane(lblWidth), 200, 150));
        stage.show();
    }
}
