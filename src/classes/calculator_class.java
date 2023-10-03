package classes;

public class calculator_class {
  public static void main(String[] args)
  {
	  calculator calc = new calculator();
	  System.out.println(calc.sum(2, 3));
	  System.out.println(calc.division(3,32));
	  int  result = calc.multiplication(20,3);
	  int result2 = calc.subraction(699,2);
	  System.out.println(result);
	  System.out.println(result2);
  }
}
