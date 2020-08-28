package learning;

import java.awt.*;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.*;

/**
 *
 * @author bns
 */
public class VI_SceneGraph extends Application {

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
//        //here we create a regular window
//        Scene scene = new Scene(new Group(), 300, 250);
//        //change window style
//     //   stage1.initStyle(StageStyle.TRANSPARENT);
//        stage1.setTitle("Main Window");
//        stage1.setFullScreen(true);
//        stage1.setFullScreenExitHint("Ctrl+T");
//        stage1.setFullScreenExitKeyCombination(KeyCombination.valueOf("Ctrl+T"));
//        stage1.setScene(scene);
//
//        stage1.show();

        StackPane root = new StackPane();

        //child 1
        CheckBox node = new CheckBox("I am ready for JavaFX!");

        //child 2
        Rectangle rect = new Rectangle(70,70, Color.GREEN );

        //add nodes to stackPane
        root.getChildren().addAll(node, rect);
        Scene scene = new Scene(root, 150, 100);
        stage1.setScene(scene);
        stage1.setTitle("Hello Fx!");
        stage1.show();

        traverse(root, 1);


    }


    /**
     * This code runs before application exits. You can free resources etc here.
     * @throws Exception
     */
    @Override
    public void stop() throws Exception {
        System.out.println("After... Before stopping");

    }


    public void traverse(Node node, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println(node.getClass());
        if (node instanceof Parent) {
            Parent parent = (Parent) node;
            parent.getChildrenUnmodifiable().forEach(n->traverse(n, level +1));
        }
    }



}




