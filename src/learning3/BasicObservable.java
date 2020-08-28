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
public class BasicObservable extends Application{

    @Override
    public void start(Stage stage){
        Label lblWidth = new Label();


        // Note, we are not using any binding yet
        stage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> o, Number oldVal, Number newVal) {
                lblWidth.setText(newVal.toString());
            }
        });

        stage.setScene(new Scene(new StackPane(lblWidth), 200, 150));
        stage.show();
    }
}
