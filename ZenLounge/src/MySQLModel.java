import java.util.ArrayList;
import java.util.List;

public class MySQLModel implements DBInterface {

	@Override
	public List<Object> selectRequest(String select, String from,String where) {
		System.out.println("----------------\nRequest executed :\n"+select+"\n"+from+"\n"+where+"\nDefault return : Joris\n----------------");
		List<Object> results = new ArrayList<Object>();
		results.add("Joris");
		return results;
	}
}