package learning7;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author bns
 */
public class BusinessController implements Initializable {
    @FXML
    private javafx.scene.control.Button button;


    @FXML
    private TextField textField;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
 button.setText("hello");
    }


    @FXML
    private void buttonHandler(ActionEvent event){
        textField.setText("hello");
    }
}
