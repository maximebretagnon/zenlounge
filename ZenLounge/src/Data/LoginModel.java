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
			String[] select = {"name"};
			String[] from = {"user"};
			String[] where = {"ID = 50"};
			List<Object> results = db.selectRequest(select,from,where);
			if(results.size() > 0)
			name = (String)results.get(0);
		}
		return name;
	}
}