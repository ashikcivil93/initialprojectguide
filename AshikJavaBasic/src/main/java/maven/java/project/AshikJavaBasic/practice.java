package maven.java.project.AshikJavaBasic;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
     Scanner mani= new Scanner (System.in);
    System.out.println("Tell us where you want to go :");
    int distance = mani.nextInt();
    
    
    int CostToBePaid=distance*17;
    System.out.println("Enter the amount to be book ");
    int userpay=mani.nextInt();
    
    if (userpay>=CostToBePaid) {
    	System.out.println("your trip for chennai"+distance+"has booked");
    }
    else
    	{
    		System.out.println("your booking is not confirmed");
    	
    	}
    
         mani.close();
    		
    
	}
}

