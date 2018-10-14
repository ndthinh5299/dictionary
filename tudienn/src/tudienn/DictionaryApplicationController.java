/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudienn;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import static tudienn.DictionnaryCommanLine.dictionarySearcher;

/**
 * FXML Controller class
 *
 * @author thinhnguyen
 */
public class DictionaryApplicationController extends Application{
    
    private DictionaryManagement dictionaryManagement = new DictionaryManagement();
    private static Dictionary d;
    private static Word w = new Word("","nope" ) ;
    private static String s ;
   
    public void dictionaryAdvanced(){
         d = dictionaryManagement.insertFromFile();
         
        //showAllWords(d);
        //Word w = dictionaryManagement.dictionaryLookup(d);
        //if(w != null){ 
        //System.out.println("tieng viet: "+ w.getWord_explain());
        //dictionaryManagement.speech(w.getWord_target());
        //}
        //else System.out.println( "khong tim dc");
        //List<String> a = dictionarySearcher(d, "tra");
        //for(String s: a){
        //    System.out.println(s);
        //}
        
        //d = dictionaryManagement.AddWord(d);
    }
    /**
     * Initializes the controller class.
     */
    @FXML 
    private TextField wSearch;
    @FXML
    private Button search;
    @FXML
    private Button addWord;
    @FXML
    private Button editWord ;
    @FXML
    private Button delWord;
    @FXML
    private Button voice;
    @FXML 
    private WebView webView;
    @FXML
    private ListView<String> listView;
    
    
    public void clickSearch(ActionEvent event){
        s = wSearch.getText();
        w = dictionaryManagement.dictionaryLookup(s, d);
        String html = w.getWord_explain();
        WebEngine webEngine = webView.getEngine();
        webEngine.loadContent(html);
        
        
       // System.out.print(s);
    }
    public void ShowList(ActionEvent event){
       // listView = dictionaryManagement.
    } 
    public void clickVoice(ActionEvent event){
        dictionaryManagement.speech(w.getWord_target());
    }
    
    public static void main(String[] args) {
        DictionaryApplicationController dac = new DictionaryApplicationController();
        dac.dictionaryAdvanced();
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
       try{
           Parent root = FXMLLoader.load(getClass().getResource("DictionaryApplication.fxml"));
           Scene scene = new Scene(root);
           primaryStage.setScene(scene);
           primaryStage.setTitle("Dictionary by NGUYEN DINH THINH");
           primaryStage.show();
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
}
