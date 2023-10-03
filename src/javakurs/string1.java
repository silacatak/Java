package javakurs;

public class string1 {
  public static void main(String[] args) {
	  String message = "Today,the weather is very nice.";
	  System.out.println("Message:"+message);
	  
	  System.out.println("Number of elements:"+message.length());//it shows how many characters there are 
	  System.out.println("5.element:"+message.charAt(4)); // the character in the fifth element
	  System.out.println(message.concat(" Life is beautiful")); // this sentence added
	  System.out.println("Result:"+message.startsWith("t")); // to the sentence start with"t"
	  System.out.println("Result:"+message.endsWith(".")); 
	  System.out.println(message.indexOf("day")); //which index started "day" word
	  System.out.println(message.lastIndexOf("e")); // the final index
	 
  }
}
