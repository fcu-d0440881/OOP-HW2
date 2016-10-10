package oop_java;

import java.util.Scanner;

public class PrintNumberInWord {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer : ");
		int num = sc.nextInt();
		sc.close();
		String str = "";
		if(num < 1 || num > 9) str = "\"OTHER\"";
		else{
			if(num == 1) str = "\"ONE\"";
			else if(num == 2) str = "\"TWO\"";
			else if(num == 3) str = "\"THREE\"";
			else if(num == 4) str = "\"FOUR\"";
			else if(num == 5) str = "\"FIVE\"";
			else if(num == 6) str = "\"SIX\"";
			else if(num == 7) str = "\"SEVEN\"";
			else if(num == 8) str = "\"EIGHT\"";
			else if(num == 9) str = "\"NINE\"";
		}
		System.out.println("The input integer is " + str + ".");
	}
}
