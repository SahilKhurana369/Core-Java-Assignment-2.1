package Assignment_2;															// package declaration
/**
 * Write a program to find the highest among the given 3 numbers  
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 *
 */
import java.util.Scanner;														// This will import the Scanner class
public class Assignment_2_1 {													// Proper naming conventions is used for Class Declaration
	public static void main(String[] args) {									// Main methods Starts
		int x, y, z;															// Three Integers(Variable) Declaration x,y and z
        System.out.print("Enter First integers X  : ");							// This will print out the argument and ends the line
        Scanner in = new Scanner(System.in);									// Initialize the scanner to get input from User
        x = in.nextInt();														// Read input integer x from the User
        System.out.print("Enter Second integers Y : ");							// This will print out the argument and ends the line
        y = in.nextInt();														// Read input integer y from the User
        System.out.print("Enter Third integers Z  : ");							// This will print out the argument and ends the line
        z = in.nextInt();														// Read input integer z from the User
		if ( x > y && x > z )													// if loop Expression to check the value of x is greater then y and z	
            System.out.println(x + " is larger than " + y +" and " +z);		    // if the value of x is greater then y and z This will print out the argument x is larger then y and z
        else if ( y > x && y > z )												// the above condition is not true then else if loop Expression will check the value of y is greater then x and z 
            System.out.println(y+ " is larger than " + x +" and " +z);			// if the value of y is greater then x and z This will print out the argument y is larger then x and z
        else if ( z > x && z > y )												// both the above conditions is not true then else if loop Expression will check the value of z is greater then x and y 
            System.out.println(z+ " is larger than " + x +" and " +y);			// if the value of z is greater then x and y This will print out the argument z is larger then x and y
        else																	// all the three above conditions are not true.   
            System.out.println("Entered numbers are not distinct.");			// for Example x=2, y=2 and z =1, if any of the two variable have the same largest number then it will print Entered numbers are not distinct.
        in.close();																// object "in" closed 
	}																			// Main methods Closed
}																				// class Assignment_2_1 closed			
