import java.util.*;
public class Random{
  public static void main (String []args){
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan jumlah bilangan random: ");
  int n=sc.nextInt ();
  int i=0;
  int total= 0;
  int bilRandom= 0;
while (i<n)
{
bilRandom = (int) (Math.random()*10);
System.out.println ((i+1) + "=" +bilRandom);
total +=bilRandom;
i++;
			
			
}
System.out.println ("Total :" +total);
}
}
