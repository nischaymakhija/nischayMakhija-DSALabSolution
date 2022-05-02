package com.greatlearning.brackets;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter brackets to be inserted");
		String character=sc.next();
		BalancedBrackets bb=new BalancedBrackets();
		
		boolean Answer =bb.BracketsBalanced(character);
		if(Answer==true)
		{
			System.out.println("The entered String has Balanced Brackets");
		}
		else
		{
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		sc.close();
	}

}

