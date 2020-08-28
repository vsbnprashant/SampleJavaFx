package learning6;

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
// chapter4/includes/FirstController.java
public class MasterController implements Initializable {

    @FXML
    private NestedController myLabelController; // name is tricky! See below.

    @FXML
    void btnAction(ActionEvent event) {
        myLabelController.setButtonText(textField.getText());
    }

    @FXML
    private TextField textField;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}