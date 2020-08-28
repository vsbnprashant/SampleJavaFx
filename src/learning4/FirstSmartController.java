package learning4;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author bns
 */
public class FirstSmartController implements Initializable {

    public void setText(String newText) {
        textField.setText(newText);
    }

    @FXML
    private Button button;

    @FXML
    private TextField textField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        button.setText("hello");
    }
}
