package polymorphism;

public class consoleLogger extends BaseLogger{

	
	public void log(String message)
	{
		System.out.println("logged to console"+message);
	}
}
