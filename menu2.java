import java.io.*;

public class menu2
{
 public static void main (String []args) throws IOException 
 { BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  //3
  
  int[] harga = new int [5];
  int[] total = new int [5];
  int[] jmlPesanan = new int [5];
  int totalTransaksi = 0;
  int pil = 0;
  
  do 
  {
   System.out.println("====================");
   System.out.println("  | MENU Makanan / Minuman  | ");
   System.out.println("====================");
   System.out.println("1. Soto Ayam  ");
   System.out.println("2. Nasi Rawon  ");
   System.out.println("3. Gado - Gado  ");
   System.out.println("4. ES Teh   ");
   System.out.println("5. ES Jeruk  ");
   System.out.println("6. TOTAL ");
   System.out.println("7. KELUAR ");
   System.out.print("MASUKKAN NO PILIHAN ANDA (1-7):");
   System.out.println();
   pil = Integer.parseInt(br.readLine());
   
  
    switch(pil)
    {
     case 1:
     harga[0] = 10000;
     System.out.println();
     System.out.println("====================");
     System.out.println("  | MENU MAKANAN|  ");
     System.out.println("====================");
     System.out.println(" Soto Ayam  ");
     System.out.println("harga : Rp" + harga[0]);
     System.out.print("Pesan Berapa? :");
     jmlPesanan[0] = Integer.parseInt(br.readLine());
     total[0] = harga[0]*jmlPesanan[0];
     System.out.println("Total =" + total[0]);
     System.out.println();
     break;
     
     case 2:
     harga[1] = 15000;
     System.out.println();
     System.out.println("====================");
     System.out.println(" | MENU MAKANAN|  ");
     System.out.println("====================");
     System.out.println(" Nasi Rawon");
     System.out.println("Harga : Rp" + harga[1]);
     System.out.print("Pesan Berapa? :");
     jmlPesanan[1] = Integer.parseInt(br.readLine());
     total[1] = harga[1]*jmlPesanan[1];
     System.out.println("TOTAL =" + total[1]);
     System.out.println();
     break;
     
    
     
     case 3:
     harga[2] = 8000;
     System.out.println();
     System.out.println("====================");
     System.out.println(" | MENU MAKANAN| ");
     System.out.println("====================");
     System.out.println(" Gado - Gado  ");
     System.out.println("Harga : Rp" + harga[2]);
     System.out.print("Pesan Berapa ? :");
     jmlPesanan[2] = Integer.parseInt(br.readLine());
     total[2] = harga[2]*jmlPesanan[2];
     System.out.println("TOTAL =" + total[2]);
     System.out.println();
     break;
     
    
     case 4:
     harga[3] = 2000;
     System.out.println();
     System.out.println("====================");
     System.out.println(" | MENU MINUMAN | ");
     System.out.println("====================");
     System.out.println("  ES Teh");
     System.out.println("Harga : Rp" + harga[3]);
     System.out.print("Pesan Berapa? :");
     jmlPesanan[3] = Integer.parseInt(br.readLine());
     total[3] = harga[3]*jmlPesanan[3];
     System.out.println("TOTAL =" + total[3]);
     System.out.println();
     break;
     
    
     case 5:
     harga[4] = 3000;
     System.out.println();
     System.out.println("====================");
     System.out.println(" | MENU MINUMAN | ");
     System.out.println("====================");
     System.out.println(" ES Jeruk  ");
     System.out.println("Harga: Rp" + harga[4]);
     System.out.print("Pesan Berapa ? :");
     jmlPesanan[4] = Integer.parseInt(br.readLine());
     total[4] = harga[4]*jmlPesanan[4];
     System.out.println("TOTAL =" + total[4]);
     System.out.println();
     break;
    
     case 6:
     System.out.println();
     System.out.println("========================");
     System.out.println(" | TOTAL PEMBELIAN |");
     System.out.println("========================");
     System.out.println("Soto Ayam = "  + total[0]);
     System.out.println("Nasi Rawon = " + total[1]);
     System.out.println("Gado - Gado = " + total[2]);
     System.out.println("ES Teh =" + total[3]);
     System.out.println("ES Jeruk =" + total[4]);
     totalTransaksi = total[0]+total[1]+total[2]+total[3]+total[4];
     System.out.println("TOTAL PEMBELIAN = Rp" + totalTransaksi);
     System.out.println();
     break;
     
    default: break;
   }   
  }
  while(pil<7);
 }
}
