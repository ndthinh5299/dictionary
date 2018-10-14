/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

import java.awt.Desktop;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import tudienn.DictionaryManagement;

/**
 *
 * @author thinhnguyen
 */
public class addWordController {
    @FXML
    private TextField wTarget;
    private TextField wExplain;
    
    public void Sumit (ActionEvent event){
        String wTarget_ = wTarget.getText();
        String wExplain_ = wExplain.getText();
        
        
    }
}
