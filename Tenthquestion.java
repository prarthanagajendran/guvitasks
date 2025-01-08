package javabasics;

import java.util.Scanner;

public class Tenthquestion {

	public static void main(String[] args) {
		 Scanner myObj=new Scanner(System.in);
			
		   System.out.println("Enter number");
		   int num=myObj.nextInt();


	        int n = num; // taking the copy of the number
	        int count = 0;
	        
	        while(n > 0){
	            n = n / 10;
	            count++;
	        }
	        
	        System.out.println("Number of digits in "+num+" are "+count);
	        
	    }
	    
	}

	



