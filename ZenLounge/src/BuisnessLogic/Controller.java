package BuisnessLogic;
import Data.Model;

public abstract class Controller {

	protected Model data;
	
	public Controller(Model data){
		this.data = data;
	}
}