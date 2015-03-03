package BL.Managers;

import java.sql.SQLException;

import BL.Others.Utilitary;
import Data.Datas.UserData;
import UI.Common.ViewIF;

public class UserManager {
	
    public UserData userData;

    public ViewIF viewIF;
    
    public UserManager(ViewIF viewIF){
    	userData = new UserData();
    	this.viewIF = viewIF;
    }

    public String handleLogin(String login, String pwd) {
    	
    	String errorMessage = null;

    	try {
			userData = UserData.getUser(login);
	    	System.out.println(Utilitary.hash(pwd));
			
	    	
	    	if(!Utilitary.hash(pwd).equals(userData.getPwd())) {
	    		if(userData.getLogin().equals(""))	
		    		errorMessage = "Incorrect Login/Password combination. Please try again.";
	    		else
	    			errorMessage = "Incorrect Password. Please try again.";
	    	}
	    	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			errorMessage = e.getMessage();
		}
    	
    	return errorMessage;
    }
}