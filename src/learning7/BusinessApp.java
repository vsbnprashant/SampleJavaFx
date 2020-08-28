package learning7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class BusinessApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox root = (HBox) FXMLLoader.load(
                getClass().getResource("BusinessDocument.fxml"));


        Scene scene = new Scene(root, 300, 80);
        stage.setScene(scene);
        stage.show();
    }
}
