package javabasics;

import java.util.Scanner;

public class Secondquestion {

	public static void main(String[] args) {
   Scanner myObj=new Scanner(System.in);
   System.out.println("Enter a number");
   int a=myObj.nextInt();
   
   
if(a%2==0) {// To find the number is even
	System.out.println("The number is even");
}
else {
	System.out.println("The number is not even");
}
  myObj.close();
	}
}
