package maven.java.project.AshikJavaBasic;

import java.util.Scanner;

public class prac2 {
 public static void main(String[] args) {
	
  Scanner ashik = new Scanner(System.in);
 
  int Stock =50;
   while (Stock>0)// sale could be continue till stock become 0;
   {
	   System.out.println("Tell me how many laptops do you want:");
	   int Require = ashik.nextInt();
	   if(Require<=Stock)//we can take the order as per the aspects
	   {
		   int costToBePaid =Require*40000;
		   int userpay=ashik.nextInt();
		   if (userpay>=costToBePaid)
		   {
			   System.out.println("your order done");
			    Stock=Stock-Require;
		   }
		    else
		    	System.out.println("amount is not enough to place order");
	   }
	   
	   else
		   System.out.println("insufficient stock to place order");
			   
   }
   ashik.close();
   
	 	     
 }
}
	


