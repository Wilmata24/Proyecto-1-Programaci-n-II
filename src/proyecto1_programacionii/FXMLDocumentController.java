/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_programacionii;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import proyecto1_programacionii.Bibliotecario;
import proyecto1_programacionii.Proyecto1_ProgramacionII;

/**
 *
 * @author Wilmata
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private static List lista;
    @FXML
    private TextField txfUsuario;
    @FXML
    private PasswordField txfContraseña;
    @FXML
    private Button btnIngresar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void accionBotonIngresar(ActionEvent event) throws IOException {

        //Bibliotecario permanente
        List<Bibliotecario> lista = new ArrayList<Bibliotecario>();
        Bibliotecario bl = new Bibliotecario("bibliotecario01", "1234", "Juan Solano", "Nacional", "123456789");
        lista.add(bl);
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("InterfazBibliotecario.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //Esta linea obtiene la informacion del Stage
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //Verifica datos del usuario
        if (txfUsuario.getText().equals(bl.getNombreUnico()) && (txfContraseña.getText().equals(bl.getContraseña()))) {

            window.setScene(tableViewScene);
            window.show();

        } else {
            System.out.println("Usuario invalido");
        }
    }

}
