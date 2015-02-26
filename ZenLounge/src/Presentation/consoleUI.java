package Presentation;
import BuisnessLogic.BL;

public class consoleUI implements UIInterface{

	private BL bl;
	
	public consoleUI(BL bl){
		this.bl = bl;
	}
	
	public void alertName(){
		alert(bl.getName());
	}
	
	@Override
	public void alert(String message) {
		System.out.println("Alert : "+message);
	}
}