
public class Main {

	public static void main(String[] args) {
		
		consoleUI console = new consoleUI();
		MySQLModel mysql = new MySQLModel();
		Data data = new Data(mysql);
		
		BL bl = new BL(console,data);

		bl.alertName();
	}
}