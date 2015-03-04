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
    	
    	try {
			userData = UserData.getUser(login,pwd);
			
			if(userData == null)
				return "Informations incorrectes. Veuillez réessayer";
			
	    	System.out.println(pwd);
		}
    	catch (SQLException e)
    	{
			return e.getMessage();
		}
    	return null;
    }
}