package polymorphism;

public class emailLogger extends baseLogger {
	public void logger(String message)
	  {
		  System.out.println("Logged to email:"+message);
	  }
}
