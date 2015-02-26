package Presentation;
import BuisnessLogic.Controller;

public abstract class View implements UIInterface{

	protected Controller bl;
	
	public View(Controller bl){
		this.bl = bl;
	}
	
	@Override
	public void alert(String message) {
		System.out.println("Alert : "+message);
	}
}