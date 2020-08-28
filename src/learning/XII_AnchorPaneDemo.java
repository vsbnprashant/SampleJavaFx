package learning;

import static javafx.scene.paint.Color.BLUE;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.*;

/**
 *
 * @author bns
 */
public class XII_AnchorPaneDemo extends Application {

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

        Rectangle rect = new Rectangle(50, 50, BLUE);
        Pane root = new AnchorPane(rect);
        AnchorPane.setRightAnchor(rect, 20.);
        AnchorPane.setBottomAnchor(rect, 20.);stage1.setTitle("Anchor Pane");
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




