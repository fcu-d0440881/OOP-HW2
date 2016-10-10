package oop_java;

import java.util.Scanner;

public class StringComparator {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		System.out.print("Enter a string 1 : ");
		str1 = sc.next();
		System.out.print("Enter a string 2 : ");
		str2 = sc.next();
		sc.close();
		int result = str1.compareToIgnoreCase(str2);
		if(result == 0) System.out.println("The two strings are the same.");
		else System.out.println("The two strings are not the same.");
	}

}
