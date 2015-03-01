package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database
{	
	private static final String url = "jdbc:mysql://pandacoding.c0iuibsqekzw.us-west-2.rds.amazonaws.com:3306/ZenLounge";
	private static final String login = "pandacoding";
    private static final String pwd = "pandacoding";
    private static Connection connexion = null;
    
    public static void open() {
		
    	/* Chargement du driver */
		try {
		    Class.forName( "com.mysql.jdbc.Driver" );
		} catch ( ClassNotFoundException e ) {
		    /* Gérer les éventuelles erreurs ici. */
		}
		
		/* Ouverture de la connexion */
    	try {
		    connexion = DriverManager.getConnection( url, login, pwd );
		} catch ( SQLException e ) {
		    /* Gérer les éventuelles erreurs ici */
		}
    }

    public static ResultSet request(String request) {
    	
    	/* Si la connexion n'existe pas, on l'ouvre */
    	if (connexion == null)
    		open();
    	
    	/* Exécution d'une requête de lecture */
    	ResultSet resultat = null;
    	Statement statement = null;
		
    	try {
			statement = connexion.createStatement();
		} catch (SQLException e1) {
			/* Gérer les éventuelles erreurs ici */
		}
    	
    	try {
			resultat = statement.executeQuery( "SELECT id, email, mot_de_passe, nom  FROM Utilisateur;" );
		} catch (SQLException e) {
			/* Gérer les éventuelles erreurs ici */
		}
    	
    	return resultat;
    }

    public static void close() {
	    if (connexion != null)
	        try {
	            /* Fermeture de la connexion */
	            connexion.close();
	        } catch ( SQLException ignore ) {
	            /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
	        }
    }
}