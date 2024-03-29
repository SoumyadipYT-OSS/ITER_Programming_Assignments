/*
  	Write a Java program that takes all the lines input to standard input and writes them to 
	standard output in reverse order. That is, each line is output in the correct order, but the 
	ordering of the lines is reversed.
*/

import java.util.Scanner;
public class Q4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many lines you want to enter : ");
		String[] input = new String[sc.nextInt()];
		sc.nextLine();
		System.out.println("\nEnter sentences : ");
		for (int i=0; i<input.length; i++)
		{
			input[i] = sc.nextLine();
		}
		
		System.out.println("\n***YOUR INPUT***");
		for (String s:input)
		{
			System.out.println(s);
		}
		System.out.println("\n***REVERSE ORDER***");
		for (int i=input.length-1; i>=0; i--)
		{
			System.out.println(input[i]);
		}
		sc.close();
	}
}