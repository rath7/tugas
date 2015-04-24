import java.util.*;
class perhitungan {
public static void main (String[]args){
Scanner rs=new Scanner (System.in);
		
System.out.print("Masukkan Jumlah Soal : ");
		
int soal=rs.nextInt();
		
int angka1;
int a=0;
int angka2;
int hasil;
int nilai=0;
int jawabSalah=0;
int jawabBenar=0;
		
System.out.println ("");
System.out.println ("SOAL !!");
System.out.println ("");
			
while(a<soal){
			
angka1=(int)(Math.random()*20);
angka2=(int)(Math.random()*10);
			
System.out.print ((a+1)+" . "+ angka1 +" + " + angka2 + " = " ); 
hasil=rs.nextInt();
			
int jawaban=angka1+angka2;
if(jawaban==hasil){
System.out.println ("Benar");
nilai+=10;
					
}else{
System.out.println ("Salah");
nilai-=5;
}
a++;
}
System.out.println ("");
System.out.println("Nilai Anda : " + nilai);

  }
}
