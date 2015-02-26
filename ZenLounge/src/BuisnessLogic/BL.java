package BuisnessLogic;
import Data.Data;

public class BL {

	private Data data;
	
	public BL(Data data){
		this.data = data;
	}
	
	public String getName(){
		return data.getName();
	}
}