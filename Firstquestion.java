package javabasics;

import java.util.Scanner;

public class Firstquestion {

	public static void main(String[] args) {
		 Scanner myObj=new Scanner(System.in);
		
		   System.out.println("Enter a:");
		   int a=myObj.nextInt();
		   System.out.println("Enter b:");
		   int b=myObj.nextInt();
		   System.out.println("Enter c:");
		   int c=myObj.nextInt();
		   System.out.println("Enter d:");
		   int d=myObj.nextInt();
		   
		if(a+b>c+d) {//a+b is greater than c+d
			System.out.println("a+b is greater than c+d");
		}
		else {
			System.out.println("a+b is not greater than c+d");
		}
		  myObj.close();
		// TODO Auto-generated method stub
		
		
		

	}

}
