import Presentation.*;
import BuisnessLogic.*;
import Data.*;

public class Main {

	public static void main(String[] args) {

		MySQLDB mysql = new MySQLDB();
		
		Model loginModel = new LoginModel(mysql);
		Controller loginController = new LoginController(loginModel);
		View loginView = new LoginView(loginController);
	
		((LoginView)loginView).alertName();
	}
}