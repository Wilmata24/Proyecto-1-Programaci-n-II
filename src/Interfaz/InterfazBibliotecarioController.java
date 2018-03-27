/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;


public class InterfazBibliotecarioController implements Initializable {

    @FXML private AnchorPane anchorP;
    
    @FXML
    public void accionImagenUsuario() throws IOException {
        
        AnchorPane anchor = FXMLLoader.load(getClass().getResource("InterfazAgregar"));
        anchorP.getChildren().setAll(anchor);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
