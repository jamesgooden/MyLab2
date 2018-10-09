package day1;

import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double userLength;
		double userWidth;
		double userHeight;
		double area;
		double perimeter;
		double volume;
		String userInput;
		String Y;
		String N;

		System.out.println("Welcome to Grand Circus' Room Detail generator!");
		System.out.println("Enter Length: ");
		userLength = scan.nextDouble();
		System.out.println("Enter Width: ");
		userWidth = scan.nextDouble();
		System.out.println("Height: ");
		userHeight = scan.nextDouble();
		
		area = userLength * userWidth;
		System.out.println("Area: " + area);

		perimeter = (userLength + userWidth);
		perimeter = perimeter * 2;
		System.out.println("Perimeter: " + perimeter);
		
		volume = userLength* userHeight * userWidth;
		System.out.println ("Volume: " + volume);
        
		System.out.println("Continue? (y/n)");
		userInput = scan.next();

		while (userInput.equalsIgnoreCase("Y")) {
			System.out.println("Enter Length: ");
			userLength = scan.nextDouble();
			System.out.println("Enter Width: ");
			userWidth = scan.nextDouble();
			System.out.println("Height: ");
			userHeight = scan.nextDouble();
			
			area = userLength * userWidth;
			System.out.println("Area: " + area);

			perimeter = (userLength + userWidth);
			perimeter = perimeter * 2;
			System.out.println("Perimeter: " + perimeter);
			
			volume = userLength* userHeight * userWidth;
			System.out.println ("Volume: " + volume);
	        
			System.out.println("Continue? (y/n)");
			userInput = scan.next();
			if (userInput.equalsIgnoreCase("N")) {
				System.out.println("Goodbye");
				break;
			}
                  
			
		}
	 
	   
	   
	    
	    
	    
	    
	 
	    

	

}
}