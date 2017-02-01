package com.mycompany.grafica2;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
public class FXMLController implements Initializable {
    
    LinkedList<personas> lista1 = new LinkedList<>();
    @FXML
    private Label nom;
    @FXML
    private Label i;
    @FXML
    private Label e;
    
    @FXML
    private WebView datmost;
    
    @FXML 
    private TextField nombr;
    @FXML 
    private TextField idr;
    @FXML 
    private TextField edar;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String nombre = nombr.getText();
        String id = idr.getText();
        String edad = edar.getText();
        
        
        personas obj = new personas(id,edad,nombre);
        
        lista1.add(obj);
        String d1 = "";
        String d2 = "";
        String d3 = "";
        String tabla = "";
        
        for(int i =0; i < lista1.size(); i++){
            d1 = lista1.get(i).nombre;
            d2 = lista1.get(i).id;
            d3 = lista1.get(i).edad;
            
            tabla += "<TR>\n" +
		"<TH>"+  d1    +"</TH><TH>"+     d2    +"</TH> <TH>" +  d3    + "</TH>\n" +
      	"</TR>\n" ; 
            
        }
        
        
        
        
        datmost.getEngine().loadContent(" <html>\n" +
"<head><title> beta </title></head>\n" +
"<body>\n" +
"                <TABLE BORDER>\n" +
"	<TR>\n" +
"		<TH>nombre</TH> <TH>edad</TH> <TH>id</TH>\n" +
"	</TR>\n" + tabla +
                
                
"        </TABLE>\n" +
"                        </body>\n" +
"    </html> "
  );
                
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
