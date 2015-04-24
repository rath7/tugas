import java.util.*;

public class ketupat
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Masukkan Bilangan :");
	int n = sc.nextInt();
	
	//bagian atas
	for(int i=n; i>=1; i--)
	{
		for(int y=i-1; y>=1; y--)
		{
			System.out.print("*");
		}
		
		for(int j=1; j<=((n+1)-i)*2; j++)
		{
			System.out.print(" ");
		}
		
		for(int a=i-1; a>=1; a--)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}

	//bagian bawah
	for(int i=n; i>=1; i--)
	{
		for(int l=1; l<=n-i; l++)
		{
			System.out.print("*");
		}
		
		for(int j=i*2; j>=1; j--)
		{
			System.out.print(" ");
		}
		
		for(int b=1; b<=n-i; b++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
}
}