package learning;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class IV_FXModality extends Application {

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
        //here we create a regular window
        Scene scene = new Scene(new Group(), 300, 250);
        stage1.setTitle("Main Window");
        stage1.setScene(scene);
        stage1.show();

        //this window doesnt block mouse and keyboard events
//        Stage stage2 = new Stage();
//        stage2.setTitle("I dont block anything");
//        stage2.initModality(Modality.NONE);
//        stage2.show();


        //this window blocks everything - you cant interact with other windows
        // while its open
//        Stage stage3 = new Stage();
//        stage3.setTitle("I block everything");
//        stage3.initModality(Modality.APPLICATION_MODAL);
//        stage3.show();
//
//        // this window blocks only interaction with it's owner window (stage1)
        Stage stage4 = new Stage();
        stage4.setTitle("I block only clicks to main window");
        stage4.initOwner(stage1);
        stage4.initModality(Modality.WINDOW_MODAL);
        stage4.show();


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




