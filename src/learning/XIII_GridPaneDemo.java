package learning;

import static javafx.scene.paint.Color.BLUE;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class XIII_GridPaneDemo extends Application {

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

        GridPane root = new GridPane();
        for (int i = 0; i < 5; i++) {
            root.getColumnConstraints().add(new ColumnConstraints(50));
            root.getRowConstraints().add(new RowConstraints(50));
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i+j)%2 == 0)
                    root.add(new Rectangle(30, 30, Color.BLUE), i, j);
            }
        }
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




