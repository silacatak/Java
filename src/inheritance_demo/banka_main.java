package inheritance_demo;

public class banka_main {
   public static void main(String[] args)
   {
	   krediUI kredi = new krediUI();
	   kredi.krediHesapla(new tarimKrediManager());
	   
   }
}
