/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_programacionii;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Wilmata
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private static List lista;
    @FXML private TextField txfUsuario;
    @FXML private PasswordField txfContraseña;
    @FXML private Button btnIngresar;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }   
    
     @FXML
    public void accionBotonIngresar(){
        
        //Bibliotecario permanente
       List<Bibliotecario> lista = new ArrayList<Bibliotecario>();
       Bibliotecario bl = new Bibliotecario("bibliotecario01", "1234", "Juan Solano", "Nacional", "123456789");
       lista.add(bl);
       
       //Verifica datos del usuario
       if (txfUsuario.getText().equals(bl.getNombreUnico()) && (txfContraseña.getText().equals(bl.getContraseña()))) {
           
           System.out.println("Usuario valido");
           
       } else
           
            System.out.println("Usuario invalido");
    }
    
    
    
}
