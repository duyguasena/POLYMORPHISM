package polymorphism;

public class customerManager {
	
	private BaseLogger logger;
	
	public customerManager(BaseLogger logger)
	{
		this.logger=logger;
	}
	
	

	public void add()
	{
		System.out.println("müşteri eklendi");
		this.logger.log("log mesajı");
		
	}
	
	
}
