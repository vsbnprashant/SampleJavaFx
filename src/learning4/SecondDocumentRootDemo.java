package learning4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class SecondDocumentRootDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(
                new SecondMyControl("Hello, World"));
        Scene scene = new Scene(stackPane, 300, 80);

        stage.setScene(scene);
        stage.show();
    }
}
