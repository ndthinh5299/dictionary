/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudienn;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author thinhnguyen
 */
public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
       try{
           Parent root = FXMLLoader.load(getClass().getResource("DictionaryApplication.fxml"));
           Scene scene = new Scene(root);
           primaryStage.setScene(scene);
           primaryStage.show();
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
}
