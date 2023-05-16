package controller;

import java.sql.Date;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.stage.Stage;

import model.DTO.Utilisateur;

public class ControllerGestionComptable 
{
	 @FXML 	private TableView<Utilisateur> tableauListeFichesComptable;
	 @FXML 	private TableColumn<Utilisateur , String > colNomFiche;
	 @FXML 	private TableColumn<Utilisateur , String > colPrenomFiche;
	 @FXML 	private TableColumn<Utilisateur , String > colAdresseFiche;
	 @FXML  private TableColumn<Utilisateur , String > colCPFiche;
	 @FXML  private TableColumn<Utilisateur , String > colVilleFiche;
	 @FXML  private TableColumn<Utilisateur , Date > colDateEmbaucheFiche;
	 @FXML  private Button btnEnregistrer;
	 @FXML  private Button btnSupprimer;
	 @FXML  private Button BtnModifier;
	 @FXML  private Button BtnQuitter;


	 public void BtnQuitterClick(ActionEvent e) 
	 {
	
		 Stage stage = (Stage) BtnQuitter.getScene().getWindow();
		 stage.close();
	 }
	 /** 
	 //Déclaration de l'ObservableList nécessaire au remplissage de la tableView
	 private ObservableList<Utilisateur> data = FXCollections.observableArrayList();
	 
	 
	 
	 private void remplissagetableViewGestionComptable() {
		 try {
			 			 
			 ResultSet rsListeFiches = UtilisateurDAO.unUtilisateur("id");
			 
			if(rsListeFiches!= null) {
				
				ArrayList<LigneFrais> mesFiches;
				rsListeFiches.beforeFirst();
				
				while (rsListeFiches.next()) {
					ResultSet rsUnVisiteur = UtilisateurDAO.unUtilisateur(rsListeFiches.getString(2));			 
					Utilisateur utilisateur = new Utilisateur(rsUnVisiteur.getString(1), rsUnVisiteur.getString(2)  , rsUnVisiteur.getString(3)   , rsUnVisiteur.getString(4)  , rsUnVisiteur.getString(5) , rsUnVisiteur.getString(6) , rsUnVisiteur.getString(7) , rsUnVisiteur.getString(8)  , rsUnVisiteur.getString(9), rsUnVisiteur.getDate(10)) ;				
					FicheFrais uneFicheFrais = new FicheFrais(rsListeFiches.getInt(1) ,rsListeFiches.getInt(3) ,rsListeFiches.getInt(4)  ,rsListeFiches.getDate(5)  ,rsListeFiches.getDate(6)  ,rsListeFiches.getString(7) , rsListeFiches.getFloat(8), utilisateur);
				 
					ResultSet rsLesLignes = FicheFraisDAO.lesLignesFicheFrais(rsListeFiches.getInt(1));
					mesFiches = new ArrayList<LigneFrais>();
					if(rsLesLignes != null){		
						rsLesLignes.beforeFirst();
						while (rsLesLignes.next()) {
							LigneFrais uneLigneFrais = new LigneFrais(rsLesLignes.getInt(1),rsLesLignes.getString(2) ,rsLesLignes.getInt(3), rsLesLignes.getString(5), rsLesLignes.getFloat(6),rsLesLignes.getInt(4));
							mesFiches.add(uneLigneFrais);
						}
					}
					
					uneFicheFrais.setLesLignes(mesFiches); 				 
					data.add(uneFicheFrais);
				}
			}
			 
			 
			 
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 
		 
		 colNomFiche.setCellValueFactory(new PropertyValueFactory<Utilisateur,String>("nom"));
		 colPrenomFiche.setCellValueFactory(new PropertyValueFactory<Utilisateur,String>("prenom"));
		 colAdresseFiche.setCellValueFactory(new PropertyValueFactory<Utilisateur,String>("adresse"));
		 colCPFiche.setCellValueFactory(new PropertyValueFactory<Utilisateur,String>("cp"));
		 colVilleFiche.setCellValueFactory(new PropertyValueFactory<Utilisateur,String>("ville"));
		 colDateEmbaucheFiche.setCellValueFactory(new PropertyValueFactory<Utilisateur,Date>("dateEmbauche"));
		 tableauListeFichesComptable.setItems(data);
	 
	 }

	 @FXML 	private AnchorPane paneId ;
	 
	 
	public void initialize() 
	 {
		 remplissagetableViewGestionComptable(); 
	 } 
	 
	 
	 public void refreshtableListeFichesGestionComptable()
	 {	  
		 tableauListeFichesComptable.refresh();		
	 }
	 **/





}