package javabasics;

import java.util.Scanner;

public class Tenthquestion {

	public static void main(String[] args) {
		 Scanner myObj=new Scanner(System.in);
			
		   System.out.println("Enter word");
		   String a=myObj.nextLine();
		   StringBuilder s=new StringBuilder(a);
		   
		 s.reverse();
		 System.out.println(s);
		  
	}

	
}


