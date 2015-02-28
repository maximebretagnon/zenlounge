package Data;

public class Database
{
	private static boolean dbOpened;
		
    private static final String login = "Database Login";
    private static final String pwd = "Database Password";
    
    
    public static void open() {
    	//Open the db
    	dbOpened = true;
    }

    public static Object request(String request) {
    	if(!dbOpened)
    		open();
    	//Execute request
    	return null;
    }

    public static void close() {
    	if(dbOpened)
    		/*Close the db*/;
    	dbOpened = false;
    }
}