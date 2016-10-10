package oop_java;

import java.util.Scanner;
public class KeyboardScanner {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer : ");
		int a;
		a = sc.nextInt();
		System.out.print("Enter a float point number : ");
		float b;
		b = sc.nextFloat();
		System.out.print("Enter your name : ");
		String str;
		str = sc.next();
		float c = a*b;
		sc.close();
		System.out.print("Hi "+ str + ", the multiplication of " + a + " and " + b + " is ");
		System.out.printf("%.2e.",c);
	}
}
