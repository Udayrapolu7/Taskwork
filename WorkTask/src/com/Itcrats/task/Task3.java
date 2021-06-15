package com.Itcrats.task;

import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first two alphabets of day in small letters ");
		String choice = sc.next();
		
		switch(choice)
		{
		case "mo":
		System.out.println("you selected monday");
		break;
		case "tu":
			System.out.println("you selected tuesday");
			break;
		case "we":
			System.out.println("you selected wednsday");
			break;
		case "th":
			System.out.println("you selected thursday");
			break;
		case "fr":
			System.out.println("you selected friday");
			break;
		case "sa":
			System.out.println("you selected saturday");
			break;
		case "su":
			System.out.println("you selected sunday");
			break;
			default:
				System.out.println("invalid day");
		break;
		}
		
		
		
		

	}

}
