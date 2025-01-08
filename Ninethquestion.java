package javabasics;

import java.util.Scanner;

public class Ninethquestion {

	public static void main(String[] args) {
		 Scanner myObj=new Scanner(System.in);
			
		   System.out.println("Enter age:");
		   int a=myObj.nextInt();
		   if(a>60) {    //To find a person senior citizen or not
			   System.out.println("The person is a senior citizen");
		   }else
		   {
			   System.out.println("The person is not a senior citizen");
		   }
		// TODO Auto-generated method stub
myObj.close();
	}

}
