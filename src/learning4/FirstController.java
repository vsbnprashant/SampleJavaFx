package learning4;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author bns
 */
public class FirstController  implements Initializable {
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
