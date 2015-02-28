package BL.Managers;

import Data.Datas.UserData;
import UI.Common.ViewIF;

public class UserManager {
	
    public UserData userData;

    public ViewIF viewIF;
    
    public UserManager(ViewIF viewIF){
    	userData = new UserData();
    	this.viewIF = viewIF;
    }

    public boolean handleLogin(String login, String pwd) {
    	return testLogin(userData.getUser(login, pwd));
    }
    private boolean testLogin(boolean userFound) {
    	return userFound;
    }
}