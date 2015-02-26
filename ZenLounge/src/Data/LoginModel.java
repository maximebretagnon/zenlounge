package Data;

import java.util.List;

public class LoginModel extends Model{

	private String name;
	
	public LoginModel(DBInterface db) {
		super(db);
		this.name = "";
	}
	
	public String getName(){
		if(name.isEmpty()) {
			List<Object> results = db.selectRequest("SELECT NAME","FROM USER","WHERE ID = 50");
			if(results.size() > 0)
			name = (String)results.get(0);
		}
		return name;
	}
}