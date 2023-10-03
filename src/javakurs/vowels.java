package javakurs;

public class vowels {
  public static void main(String[] args) {
	  char character = 'E';
	  
	  switch(character) {
	  case 'A':
	  case 'I':
	  case 'O':
	  case 'U':
		  System.out.println(character +"bold vowel");
		  break;
		 default:
			 System.out.println("thin vowel");
	  }
  }
}
