package learning4;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author bns
 */
public class SecondMyControl extends HBox {


    @FXML
    private TextField textField;

    @FXML
    private Label label;

    public SecondMyControl(String text) throws IOException {
        // here we initialize our HBox
        setAlignment(Pos.CENTER);
        setSpacing(5);

        // loading FXML and using current object as it's root and controller
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SecondDocument.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();

        // now we already can use @FXML initialized controls
        textField.setText(text);
        label.setText("Message: ");
    }
}
