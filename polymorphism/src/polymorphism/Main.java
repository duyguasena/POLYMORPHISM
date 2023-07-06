package polymorphism;             //çok biçimlilik



public class Main {

	public static void main(String[] args) {
		
//		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new consoleLogger()};
//		
//		for(BaseLogger logger:loggers)
//		{
//			logger.Log("Logger mesajı");
//		}
		
		
		customerManager customerManager=new customerManager(new FileLogger());
		customerManager.add();
		
		
	}

}
