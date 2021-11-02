package maven.java.project.AshikJavaBasic;

import java.util.Scanner;

public class nestley
{
public static void main(String[] args)
{
	System.out.println("diwali meala offer sale");
	Scanner kavin=new Scanner(System.in); 
	double income=0.0, MobilePrice=15000.6; int Stock=30;
	
 for(int days=1;days<=5&& Stock>0;days++) 
	 
 {
	 System.out.println("indicate us how many phones were sold");
	 
	 int Count=kavin.nextInt();
	 
	 income+=(Count*MobilePrice);
	 Stock-=Count;
	 MobilePrice-=(MobilePrice*0.0750);
	 
 }
 
 System.out.println("total income:"+income);
 System.out.println("Stock left:"+Stock);
 
 kavin.close();
}  



}
