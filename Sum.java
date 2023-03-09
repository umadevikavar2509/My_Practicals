package corejava;

import java.util.Scanner;

public class Sum 
{
	//Main Class
	public static void main(String[] args) 
	{
		// creating Scanner to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        
        // Use While Loop
        while (number >0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of digits is: " + sum);
    }
}
