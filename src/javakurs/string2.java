package javakurs;

public class string2 {
   public static void main(String[] args) {
	   String message = "Today,the weather is very nice.";
	   
	   String newmessage = message.replace(" ","-" );
	   System.out.println(newmessage);
	   
	   System.out.println(message.substring(0,5));// start from 2 to 5 ,not including 5
	   
	   for (String word: message.split(" ")) {
		   System.out.println(word);
	   }
	   
	   System.out.println(message.toLowerCase());
	   System.out.println(message.toUpperCase());
	   
	   
	   String name = "  Sıla  ";
	   System.out.println(name.trim());
	   
   }
}
