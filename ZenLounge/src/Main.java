import Data.Database;
import UI.Common.Frame;
import UI.Views.LoginView;

public class Main {
	public static void main(String[] args) {	
			Database.open();		
			LoginView loginView = new LoginView();
			Frame f = Frame.getFrame();
			f.setView(loginView);
			f.setVisible(true);
	}
}