package Data;
import java.util.ArrayList;
import java.util.List;

public class MySQLDB implements DBInterface {

	@Override
	public List<Object> selectRequest(String[] select, String[] from, String[] where) {
		System.out.println(	"----------------\n"
						+ 	"Request executed :");
		
		//SELECT
		System.out.print("SELECT "+select[0]);
		for(int i = 1 ; i < select.length ; i++){
			System.out.print(", "+select[i]);
		}
		System.out.println();
		
		//FROM
		System.out.print("FROM "+from[0]);
		for(int i = 1 ; i < from.length ; i++){
			System.out.print(", "+from[i]);
		}
		System.out.println();
		
		//WHERE
		System.out.print("WHERE "+where[0]);
		for(int i = 1 ; i < where.length ; i++){
			System.out.print(" AND "+where[i]);
		}
		System.out.println();
		
		//RESULT
		System.out.println("Default return : Joris\n----------------");
		List<Object> results = new ArrayList<Object>();
		results.add("Joris");
		return results;
	}
}