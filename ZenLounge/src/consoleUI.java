public class consoleUI implements UIInterface{

	@Override
	public void alert(String message) {
		System.out.println("Alert : "+message);
	}
}