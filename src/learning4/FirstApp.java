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
public class FirstApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox root = (HBox) FXMLLoader.load(
                getClass().getResource("FirstDocument.fxml"));


        Scene scene = new Scene(root, 300, 80);
        stage.setScene(scene);
        stage.show();
    }
}
