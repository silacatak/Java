package classes;

public class mainfile {
	
   public static void main(String[] args) 
   {
	   /* reference type .stack kısımda cust ve cust2nin adresleri oluştu heap bölgesiinde içeriği yani
	    *  add remove update metotlarını uygulamsı aktarıldı.
	    *  cust a cust 2 aktarıldığında ikisinin de adres 101 oldu ve ikisi de aynı 101in gttiği heap bölgesi aynı oldu*/
	   customermanager cust = new customermanager();
	   customermanager cust2 = new customermanager();
	   cust = cust2;
	   cust.add();
	   cust.remove();
	   cust.update();
	   
	   // value type .stack bölgede gerçkleşir.heap e bulaşmaz.num1=10 num2= 10 olarak num1 değerini aldı .num1= 30 olunca num2 etkilenmedi 
	   int num1 =10;
	   int num2 = 20;
	   num2=num1;
	   num1 = 30;
	   System.out.println(num2);
	   
	   // diziler referans tipdir.
	   int[] number= new int[] {1,2,3};
	   int[] number2 = new int[] {4,5,6};
	   number2 = number;
	   number[0]= 10;
	   System.out.println(number2[0]);
   }
   
}
