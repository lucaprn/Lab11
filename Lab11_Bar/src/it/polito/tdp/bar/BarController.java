/**
 * Sample Skeleton for 'Bar.fxml' Controller Class
 */

package it.polito.tdp.bar;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.bar.model.Model;
import it.polito.tdp.bar.model.Statistiche;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class BarController {
	
	Model model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnSimula"
    private Button btnSimula; // Value injected by FXMLLoader

    @FXML // fx:id="txtArea"
    private TextArea txtArea; // Value injected by FXMLLoader

    @FXML
    void OnSimula(ActionEvent event) {
    	
    	txtArea.clear();
    	model.simula();
    	Statistiche statistiche = model.getStat();
    	txtArea.appendText("Numero clienti arrivati : "+statistiche.getClientiArrivati()+"\n");
    	txtArea.appendText("Numero clienti soddisfatti : "+statistiche.getClientiSoddisfatti()+"\n");
    	txtArea.appendText("Numero clienti insoddisfatti : "+statistiche.getClientiInsoddisfatti()+"\n");
    	
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnSimula != null : "fx:id=\"btnSimula\" was not injected: check your FXML file 'Bar.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Bar.fxml'.";

    }

	public void setModel(Model model) {
		this.model=model;
		
	}
}
