import java.util.*;

public class beli{
  public static void main (String [] args){
	Scanner scn = new Scanner (System.in);
	
    System.out.print ("Masukkan Jumlah Barang yang Dibeli : ");
    int jmlBarang = scn.nextInt();
	
    int bonus = (jmlBarang / 2);
	int totalBarang = jmlBarang + bonus;	
    int harga = jmlBarang * 25000;
	
    System.out.println ("Jumlah Barang : " +jmlBarang);
    System.out.println ("Jumlah Bonus Barang : " +bonus);
    System.out.println ("Total Barang : " +totalBarang);
	System.out.println ("Total Harga Yang Harus Dibayar : Rp." +harga);
  }
}
