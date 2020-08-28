package learning;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class I_HelloFXApplication extends Application {

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
    public void start(Stage stage){
        Scene scene = new Scene(new Group(), 300, 250);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
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




