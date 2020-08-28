package learning4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class SmartApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("FirstSmartDocument.fxml"));
        HBox root = loader.load();
        loader.<FirstSmartController>getController().setText("Text from App");


        Scene scene = new Scene(root, 300, 80);
        stage.setScene(scene);
        stage.show();
    }
}
