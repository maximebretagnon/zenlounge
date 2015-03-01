package BL.Managers;

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

    public boolean handleLogin(String login, String pwd) {
    	userData = UserData.getUser(login);
    	System.out.println(Utilitary.hash(pwd));
    	return Utilitary.hash(pwd).equals(userData.getPwd()) && !userData.getLogin().equals("");
    	
    }
}