package learning;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class XI_BorderPaneDemo extends Application {

    /*
    This code runs before window creation
     */
    @Override
    public void init() throws Exception {
        System.out.println("Before");
    }


/*
Main entry point and the only method that is abstract and has to be overriden.
 */
    @Override
    public void start(Stage stage1){


      //  Rectangle top = new Rectangle(50,50, javafx.scene.paint.Color.BLUE);

        BorderPane root = new BorderPane();
        root.setRight(new Text("Right "));
        root.setCenter(new Text("Center"));
        root.setBottom(new Text(" Bottom"));
        root.setLeft(new Text(" Left"));

        Text top = new Text("Top");
        root.setTop(top);

        BorderPane.setAlignment(top, Pos.CENTER);
       stage1.setTitle("StackPane");
       Scene scene = new Scene(root, 350, 250);
       stage1.setScene(scene);
               stage1.show();

    }


    /**
     * This code runs before application exits. You can free resources etc here.
     * @throws Exception
     */
    @Override
    public void stop() throws Exception {
        System.out.println("After... Before stopping");

    }



}




