package polymorphism;

public class logger_main {
	
  public static void main(String[] args)
  {
	  baseLogger[] loggers = new baseLogger[] {new emailLogger(), new files(),new databslogger()};
	  
	  for(baseLogger log:loggers) {
	     log.logger("Log mesajı");
	   }
	 

	 
  }
}
