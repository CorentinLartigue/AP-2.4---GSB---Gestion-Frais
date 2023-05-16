package model.DAO;

import java.sql.ResultSet;

public class UtilisateurDAO {
	
	/**
	 * M�tode permettant de r�cup�rer les informations relatives � un utilisateur
	 * @param id (id utilidsateur)
	 * @return ResultSet
	 */
	public static ResultSet unUtilisateur(String id)
     {
		 	 
	     String requete = "SELECT *  FROM utilisateur where  id = '" + id + "'";
                 
         return DBConnex.getRS(requete, DBConnex.connexion());
 		
 			
     }
	
	public static ResultSet lesVisiteurs(String statut)
    {
		 	 
	     String requete = "SELECT *  FROM utilisateur where  statut = '" + statut + "'";
                
        return DBConnex.getRS(requete, DBConnex.connexion());
		
			
    }
	
}
