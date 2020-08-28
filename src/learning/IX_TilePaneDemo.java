package learning;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class IX_TilePaneDemo extends Application {

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
        TilePane root = new TilePane(5,5);
        root.setPrefColumns(4);
        root.setPrefRows(4);
        //compre to
        //FlowPnae root = new FlowPane(5,5);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                double size = 5 + 30 * Math.random();
                Rectangle rect = new Rectangle(size, size,
                        (i+j)%2 == 0 ? Color.RED : Color.BLUE);
                root.getChildren().add(rect);
            }
        }
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




