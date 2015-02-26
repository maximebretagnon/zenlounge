package BuisnessLogic;
import Data.*;

public class LoginController extends Controller{

	public LoginController(Model data) {
		super(data);
	}
	
	public String getName(){
		return ((LoginModel)data).getName();
	}
}