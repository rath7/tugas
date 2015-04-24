import java.util.*;

public class While{
public static void main (String args []){
Scanner sc = new Scanner(System.in);
System.out.print("Masukan Jumlah Data=");
	
int max=0;
int min=99;
double ratarata=0.0;
	
int jumlah=sc .nextInt();
int sum=0;
int count=0;
while (count<jumlah){	
sum += sc.nextInt();	
count++;
}
	
ratarata=sum/(double)jumlah;
max = count;
System.out.println ("Hasil SUM="+sum);
System.out.println ("Hasil RATA_RATA="+ratarata);
System.out.println ("Hasil MAX="+max);
System.out.println ("Hasil MIN="+min);
}
   }
