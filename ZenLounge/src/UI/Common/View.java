package UI.Common;

import javax.swing.JPanel;

public class View extends JPanel implements ViewIF {
	
    private String name;
    
    public View(String name){
    	super();
    	this.name = name;
    }

    //Hook for reloading components of the page
    public void reload() {}
    //Default behaviour of an alert
    public void alert(String message) {
    	System.out.println("Alert : "+message);
    }
    //Default behaviour of a confirm
    public void confirm(String message) {
    	
    }
    //Default behaviour of a prompt
    public void prompt(String message) {
    	
    }
    //Default behaviour of a log
    public void log(String message) {
    	System.out.println("Log : "+message);
    }
    //Default behaviour of a log
    public void error(String message) {
    	System.err.println("Error : "+message);
    }

    
    public String getName() {
        return this.name;
    }
    public void setName(String value) {
        this.name = value;
    }
}