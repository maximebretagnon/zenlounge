import java.util.List;

public class Data {
	
	private String name;
	private DBInterface db;
	
	public Data(String name, DBInterface db){
		this.name = name;
		this.db = db;
	}
	
	public Data(DBInterface db){
		this("",db);
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