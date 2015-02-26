package Presentation;
import BuisnessLogic.*;

public class LoginView extends View{

	public LoginView(Controller bl) {
		super(bl);
	}

	public void alertName(){
		alert(((LoginController)bl).getName());
	}
}