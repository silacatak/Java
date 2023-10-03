package polymorphism;

public class costumerManager {
   private baseLogger logger;
   
   public void customerManager(baseLogger logger) {
	   this.logger =logger;
   }
   
   public void add() {
	   System.out.println("Müşteri eklendi");
	   this.logger.logger("Log Mesajıdır");
   }
}
