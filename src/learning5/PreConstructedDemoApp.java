package learning5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import learning4.FirstSmartController;

/**
 *
 * @author bns
 */
public class PreConstructedDemoApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Preconstructed.fxml"));
        PreconstructedController pc = new PreconstructedController("new Text");
        loader.setController(pc);
        HBox root = loader.load();


        Scene scene = new Scene(root, 300, 80);
        stage.setScene(scene);
        stage.show();
    }
}
