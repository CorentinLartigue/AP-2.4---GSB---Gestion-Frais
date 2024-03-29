package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	 private Pane rootLayout;
		@Override
		/**
		 * Chargement au lancement de l'application de le vue "viewConnexion.fxml"
		 */
		public void start(Stage primaryStage) {
			
					try {
								
						
						 FXMLLoader loader = new FXMLLoader();
						 	loader.setLocation(Main.class.getResource("../view/viewConnexion.fxml"));
						 	//loader.setLocation(Main.class.getResource("../view/viewComptableListeFiches.fxml"));
				    		//loader.setLocation(Main.class.getResource("../view/viewTest.fxml"));

				            rootLayout = (Pane) loader.load();
				            
				            Scene scene = new Scene(rootLayout);
				            primaryStage.setScene(scene);
				            primaryStage.show();
				            primaryStage.setTitle("GSB Gestion des frais - Compta Fiche de frais");
						
					} catch(Exception e) {
						e.printStackTrace();
					}

			
		}
		

		public static void main(String[] args) {
			launch(args);
		}
}
