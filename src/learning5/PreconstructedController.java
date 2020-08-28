package learning5;

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
public class PreconstructedController implements Initializable {

    public void setText(String newText) {
        textField.setText(newText);
    }
   private final String newText;

    public PreconstructedController(String newText){
this.newText = newText;
    }

    @FXML
    private Button button;

    @FXML
    private TextField textField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        button.setText(newText);
    }
}
