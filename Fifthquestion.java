package javabasics;

import java.util.Scanner;

public class Fifthquestion {
	
	
	public static void main(String[] args) {
		
		 Scanner myObj=new Scanner(System.in);
			
		   System.out.println("Enter a number:");
		   int num =myObj.nextInt();

       
        int a = 1;//finding factorial of a given number
        for(int i = 1; i <= num; i++)
        {
           
           a *= i;
        }
        System.out.println(a);
    }
			}
		
	
