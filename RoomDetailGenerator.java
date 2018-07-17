//Lauren Shindo

package RoomDetailGeneratorPackage;

import java.util.Scanner;

//here's a change to test git

public class RoomDetailGenerator {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in); //initialize scanner
		double roomLength; //declare variables for length and width
		double roomWidth;
		double roomHeight;
		char a = 'y';
		
		do {
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!\n");
		
		System.out.println("Enter Length:"); //prompt user to enter lenth of room
		roomLength = scnr.nextDouble();
		
		System.out.println("Enter Width:"); //prompt user to enter width of room
		roomWidth = scnr.nextDouble();
		
		System.out.println("Enter Height:"); //prompt user to enter height of room
		roomHeight = scnr.nextDouble();
		
		System.out.println("Area: " + roomLength * roomWidth);
		System.out.printf("%.1f",roomLength);
		System.out.println("Perimeter: " + ((roomLength + roomWidth) * 2));
		System.out.println("Volume: " + roomLength * roomWidth * roomHeight + "\n");
		
		System.out.println("Continue? (y/n):");
		a =  scnr.next().charAt(0);
		
		} while ((a == 'y') || (a == 'Y'));
		
		scnr.close();

	}

}
