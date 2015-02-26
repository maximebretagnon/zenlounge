package Data;

public abstract class Model {
	
	protected DBInterface db;
	
	public Model(DBInterface db){
		this.db = db;
	}
}