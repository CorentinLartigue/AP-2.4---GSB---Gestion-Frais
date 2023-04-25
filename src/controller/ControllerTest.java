package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class ControllerTest {

	//Déclaration des variables du fichier fxml associé
	@FXML private Label lblMessage;
	@FXML private Button btn1;
	@FXML private Button btn2;
	
	//Méthode appelée lors de l'initialisation du contrôleur.
	public void initialize() {
     		lblMessage.setText("Bonjour - Cliquez sur un bouton");			
	} 	

	@FXML protected void onBtn1Clik(ActionEvent e) {
		 lblMessage.setText("Bouton 1");
	 }
	 
	 @FXML protected void onBtn2Clik(ActionEvent e) {
		 lblMessage.setText("Bouton 2");
	 }	

}

