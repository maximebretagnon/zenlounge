package Data.Datas;
import java.sql.ResultSet;
import java.sql.SQLException;

import Data.Database;

public class UserData {
	
	private String firstName;
	private String lastName;
	private String phone;
	private String mail;
	private String address;
	private String login;
	private String pwd;
	
    public UserData(){
    	this.firstName="";
    	this.lastName="";
    	this.phone="";
    	this.mail="";
    	this.address="";
    	this.login="";
    	this.pwd="";
    }
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static UserData getUser(String login, String pwd) throws SQLException {
		
    	ResultSet result = Database.getDatabase().getUser(login,pwd);
    	
    	//If the result is empty
    	if(!result.next())
    		return null;
    	//else
    	
    	//Ouverture de session
    	UserData data = new UserData();
    	
    	result.beforeFirst();
    	while ( result.next() ) {
			data.firstName = result.getString("firstName");
			data.lastName = result.getString("lastName");
			data.phone = result.getString("phone");
			data.mail = result.getString("mail");
			data.address = result.getString("address");
			data.login = result.getString("login");
			data.pwd = result.getString("pwd");
		}
	    /* On ferme le ResultSet */
	    result.close();

    	return data;
	}
}