import BuisnessLogic.BL;
import Data.Data;
import Data.MySQLModel;
import Presentation.consoleUI;

public class Main {

	public static void main(String[] args) {

		MySQLModel mysql = new MySQLModel();
		Data data = new Data(mysql);
		BL bl = new BL(data);
		consoleUI console = new consoleUI(bl);
	
		console.alertName();
	}
}