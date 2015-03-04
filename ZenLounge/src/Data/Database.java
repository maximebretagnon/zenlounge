package Data;

import java.sql.ResultSet;

public abstract class Database
{
	////Singleton pattern////
	protected static Database db;

    public static void setAsApplicationSGBD(){}
	public static Database getDatabase() {
		return db;
	}
	
	////Standard Database methods////
    public abstract void open();
    public abstract void close();
    
    ////ZenLougne database methods////
    public abstract ResultSet getUser(String login,String pwd);
}