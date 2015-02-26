
public class BL {

	private UIInterface ui;
	private Data data;
	
	public BL(UIInterface ui, Data data){
		this.ui = ui;
		this.data = data;
	}
	
	public void alertName(){
		ui.alert(data.getName());
	}
}