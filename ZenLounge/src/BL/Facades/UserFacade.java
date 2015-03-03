package BL.Facades;

import UI.Common.ViewIF;
import BL.Managers.UserManager;

public class UserFacade {
	
    public UserManager userManager;

    
    public UserFacade(ViewIF viewIF){
    	userManager = new UserManager(viewIF);
    }
    
    public boolean handleLogin(String login, String pwd) {
    	return userManager.handleLogin(login, pwd);
    }
}