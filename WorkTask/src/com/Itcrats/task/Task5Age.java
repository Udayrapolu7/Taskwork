package com.Itcrats.task;

import java.util.Scanner;
public class Task5Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the age:");
    int age = sc.nextInt();
    if (age <= 12)
    {
    	System.out.println("He is kid");
    	
    }
    else if ((age >= 12 ) && (age <= 19))
    {
  
    	System.out.println(" He is teenager");
    }
    else if ((age >= 20 ) && (age <= 50))
    {
    	System.out.println(" He is adult age group");
    }
    else if (age >= 50)
    {
    	System.out.println(" He is old age group");
    }  
    		
	}

}
