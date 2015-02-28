package Data.Datas;
import Data.Database;

public class UserData {
	
	private String name;
	
    public boolean getUser(String login, String pwd) {
    	String request = "Select id from user where login='"+login+"' and pwd = '"+pwd+"'";
    	System.out.println(request);
    	Object result = Database.request(request);
    	return result!=null;
    }
}