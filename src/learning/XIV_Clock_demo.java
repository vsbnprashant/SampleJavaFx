package learning;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author bns
 */
public class XIV_Clock_demo extends Application {

    // we are allowed to create UI objects on non-UI thread
    private final Text txtTime = new Text();

    private volatile boolean enough = false;

    // this is timer thread which will update out time view every second
    Thread timer = new Thread(() -> {
        SimpleDateFormat dt = new SimpleDateFormat("hh:mm:ss");
        while(!enough) {
            try {
                // running "long" operation not on UI thread
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
            final String time = dt.format(new Date());
            Platform.runLater(()-> {
                // updating live UI object requires JavaFX App Thread
                txtTime.setText(time);
            });
        }
    });


    @Override
    public void start(Stage stage) {
        // Layout Manager
        BorderPane root = new BorderPane();
        root.setCenter(txtTime);

        // creating a scene and configuring the stage
        Scene scene = new Scene(root, 200, 150);
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);

        timer.start();
        stage.show();
    }

    // stop() method of the Application API
    @Override
    public void stop() {
        // we need to stop our working thread after closing a window
        // or our program will not exit
        enough = true;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

