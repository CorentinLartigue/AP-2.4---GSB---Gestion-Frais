package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.DAO.FicheFraisDAO;
import model.DAO.UtilisateurDAO;
import model.DTO.FicheFrais;
import model.DTO.LigneFrais;
import model.DTO.Utilisateur;

public class ControllerGestionVisiteur {
	/**
	 * Les variables du fichier FXML associ�
	 */
	 @FXML 	private TableView<Utilisateur> tableFicheVisiteurs;
	 @FXML 	private TableColumn<Utilisateur , String > colNomVisiteur;
	 @FXML 	private TableColumn<Utilisateur , String > colPrénomVisiteur;
	 @FXML 	private TableColumn<Utilisateur , String > colAdresseVisiteur;
	 @FXML 	private TableColumn<Utilisateur , String > colCPVisiteur;
	 @FXML 	private TableColumn<Utilisateur , String > colVilleVisiteur;
	 @FXML 	private TableColumn<Utilisateur , Date > colDateEmbaucheVisiteur;
	 @FXML  private Button btnEnregistrer;
	 @FXML  private Button btnSupprimer;
	 @FXML  private Button btnModifier;
	 @FXML  private Button btnQuitter;
	 
	//Déclaration de l'ObservableList nécessaire au remplissage de la tableView
	 private ObservableList<Utilisateur> data = FXCollections.observableArrayList();
		 
	 
	 
	 private void remplissagetableViewGestionVisiteur() {
		 try {
 			 
			 ResultSet rsListeVisiteurs = UtilisateurDAO.lesVisiteurs("visiteur");
			 
			if(rsListeVisiteurs!= null) {
				
				rsListeVisiteurs.beforeFirst();
				
				while (rsListeVisiteurs.next()) {
					ArrayList<Utilisateur> lesVisiteurs;
					Utilisateur unVisiteur= new Utilisateur(rsListeVisiteurs.getString(1),rsListeVisiteurs.getString(2) ,rsListeVisiteurs.getString(3),rsListeVisiteurs.getString(4),rsListeVisiteurs.getString(5),rsListeVisiteurs.getString(6) ,rsListeVisiteurs.getString(7) ,rsListeVisiteurs.getString(8), rsListeVisiteurs.getString(9), rsListeVisiteurs.getString(10));
					lesVisiteurs.setLesLignes(unVisiteur); 
					data.add(lesVisiteurs);
				}

			}
			else {
				System.out.print("liste vide");
			}
			 
			 
			 
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 
		 
		/**colNomVisiteur.setCellValueFactory(new PropertyValueFactory<Utilisateur,String>("nom"));
		colPrénomVisiteur.setCellValueFactory(new PropertyValueFactory<Utilisateur,String>("prenom"));
		colAdresseVisiteur.setCellValueFactory(new PropertyValueFactory<Utilisateur,String>("adresse"));
		colCPVisiteur.setCellValueFactory(new PropertyValueFactory<Utilisateur,String>("cp"));
		colVilleVisiteur.setCellValueFactory(new PropertyValueFactory<Utilisateur,String>("ville"));
		colDateEmbaucheVisiteur.setCellValueFactory(new PropertyValueFactory<Utilisateur,Date>("dateEmbauche"));*/
		//tableFicheVisiteurs.setItems(data);
	 
	 }
	 
	 

	 /**
	  * Fermeture de la vue
	  * @param e
	  */
	 
	 public void btnQuitterClick(ActionEvent e) {
			
		 Stage stage = (Stage) btnQuitter.getScene().getWindow();
	     stage.close();
	 }
	
	 @FXML 	private AnchorPane paneId ;
	 
	 
	 public void initialize() {
		     	 
		 remplissagetableViewGestionVisiteur(); 
			

			
	 } 
	 
	 
	 public void refreshtableGestionVisiteur() {	 
		 
			tableFicheVisiteurs.refresh();		
		
	}
 
}
