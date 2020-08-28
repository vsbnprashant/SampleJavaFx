package learning;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class VII_Layout extends Application {

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
        VBox root = new VBox(0);
        Rectangle red;
       root.getChildren().addAll(
               new Rectangle(50,50, Color.GREEN),
               new Rectangle(75, 75, Color.BLUE),
               red = new Rectangle(90, 90, Color.RED)


       );

       red.toBack();

       stage1.setTitle("HBox");
       Scene scene = new Scene(root);
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




