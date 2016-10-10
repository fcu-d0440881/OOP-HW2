package oop_java;
import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer : ");
		int num = sc.nextInt();
		sc.close();
		if(num%2 != 0) System.out.println("The input integer is Odd Number.");
		else System.out.println("The input integer is Even Number.");
	}

}
