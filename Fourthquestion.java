package javabasics;

import java.util.Scanner;

public class Fourthquestion {

	public static void main(String[] args) {
		
		 Scanner myObj=new Scanner(System.in);
			
		   System.out.println("Enter first number");
		   int a=myObj.nextInt();
		   System.out.println("Enter second number"); 
		   int b=myObj.nextInt();
		   
		   int temp=a;
		    a=b;
		    b=temp;
		   
		   System.out.println("After swapping");
		   System.out.println("First number:" +a);
		   System.out.println("Second number:" +b);
		   
		   
	}

}
