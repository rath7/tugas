import java.io.*;
class menu {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int pilih = 0;
		int soto = 7500;
		int rawon = 8000;
		int gado = 8500;
		int teh = 1500;
		int jeruk = 2000;
		int porsi = 0;
		int lagi = 0;
		int sub =0;
		
		do {
		
		System.out.println ("Menu Makanan/Minuman");
		System.out.println ("1. Soto Ayam");
		System.out.println ("2. Nasi Rawon");
		System.out.println ("3. Gado - Gado");
		System.out.println ("4. Es teh");
		System.out.println ("5. Es Jeruk");
		System.out.print ("Masukkan Pilihan Anda (1-5) = " );
				pilih = Integer.parseInt(br.readLine());
		System.out.print ("Masukkan Jumlah Porsi = ");
				porsi = Integer.parseInt(br.readLine());
		System.out.print ("Beli Lagi ? (0= Y 1= N) = ");
				lagi = Integer.parseInt(br.readLine());
				
				
			if (pilih == 1){
				pilih = soto;
			}
				else if (pilih == 2){
					pilih = rawon;
				}
					else if (pilih == 3){
						pilih = gado;
					}
						else if (pilih == 4){
								pilih = teh;
						}
							else if(pilih == 5){
								pilih = jeruk;
							}
		sub = pilih * porsi; 			
			
		System.out.println("Subtotal = " + sub);
			
		}
		while (lagi <= 0);
		
		int total = sub;
		System.out.println ("Total Transaksi = " + total);
				
	}
}