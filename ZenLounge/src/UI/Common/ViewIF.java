package UI.Common;


public interface ViewIF {
	
    public void reload();
    public void alert(String message);
    public void confirm(String message);
    public void prompt(String message);
    public void log(String message);
    public void error(String message);
    
}