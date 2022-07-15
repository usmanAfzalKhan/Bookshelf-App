/*
 * Main class, uses all the importes.
 */
package uk.prog24178.collections;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *Has 2 methods, one is for the stage, and I gave it a title and 
 *refers to the FXML document which I made to do the FXML for this project,
 *and then there's the main method which launches the whole project.
 *@author Usman
 */
public class BookCollections extends Application {
/**
 * Parent roots the FXML file for this project,
 * has a stage title.
 * @param stage
 * @throws Exception 
 */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLBooks.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("The Book Collections of Albert, Balthasar, and Cassidy");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Launches the whole project.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
