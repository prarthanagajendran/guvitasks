package javabasics;

import java.util.Scanner;

public class Fifthquestion {

	public static void main(String[] args) {

		 Scanner myObj=new Scanner(System.in);
			
		   System.out.println("Enter a number:");
		   int num =myObj.nextInt();
		  
		   	int count=0;//check whether a number is prime or not
		                  
		   	for(int i=1;i<=num;i++)
		   	{
		   	   if(num%i==0)
		   	   {
		   	        count++;
		   	        
		   	   }
		   	}
		   	if(count==2)
		   	       System.out.println("prime number ");
		   	else
		   	System.out.println("Not a prime number ");	        
		   	}
		   
		   
	}


