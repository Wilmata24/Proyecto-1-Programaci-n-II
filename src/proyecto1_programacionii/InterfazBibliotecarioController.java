/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_programacionii;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;


public class InterfazBibliotecarioController implements Initializable {

    @FXML private AnchorPane anchorP;
    @FXML private Button bt;
    
    @FXML
    public void accionImagenUsuario(ActionEvent event) throws IOException {
        
        AnchorPane anchor = FXMLLoader.load(getClass().getResource("InterfazAgregar.fxml"));
        anchorP.getChildren().setAll(anchor);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
