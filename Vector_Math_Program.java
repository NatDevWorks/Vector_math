/**
 * Author: Nathan Douangkesone
 * Date: 1/24/2024
 * Vector_Math_Program adds, subtracts, or finds
 * the magnitude of vectors based on the user's input.
 */

import java.util.*;

public class Vector_Math_Program {
	
	public static Scanner console = new Scanner(System.in);

	// Print method overloaded for different data types
	public static void Print(Double word) {
		System.out.println(word);
	}
	
	public static void Print(String word) {
		System.out.println(word);
	}
	
	// Check if a string represents a numeric integer for menu options
	public static boolean isNumericInt(String str) {
        try {
            int number = Integer.parseInt(str);
            return number == 1 || number == 2 || number == 3 || number == 9;
        } catch (NumberFormatException e) {
            return false;
        }
    }	
	// Check if a string represents a numeric integer for vector
	public static boolean isNumericIntVector(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
	// Check if a string represents a numeric double
	public static boolean isNumericDouble(String str) {
	    try {
	        Double.parseDouble(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
	// Display vectors for addition or subtraction
	public static void displayVector(double[] vector1, double[] vector2, 
									 double[] vectorTotal, String operator) {
		Print("Result:");
		if (operator.equals("+") || operator.equals("-")) {
		    for (int x = 0; x < vectorTotal.length; x++) {
		        Print(vector1[x]);
		    }
		    Print(operator);
		    for (int x = 0; x < vectorTotal.length; x++) {
		        Print(vector2[x]);
		    }
		    Print("=");
		    for (int x = 0; x < vectorTotal.length; x++) {
		        Print(vectorTotal[x]);
		    }
		}
	}

	// Display vector magnitude
	public static void displayVector(double Magnitude) {
		Print("The magnitude is: " + Magnitude);
	}	
	
	// Method for adding two vectors
	public static void addVectors() {
		Print("Enter the size of the Vectors");
		String userInput = "";
		Double userInputDouble = 0.0;
		int arraySize = 0;
		int i = 0;
		
		// Get the size of the vectors from the user
		while(true) {
			userInput = console.nextLine();
			if(isNumericIntVector(userInput)) {
				if (Integer.parseInt(userInput) >= 1) {
					arraySize = Integer.parseInt(userInput);
					break;
				}
			} else {
				Print("Invalid input. Please enter a valid number Ex.(1).");
			}
		}
		
		// Initialize vectors
		double[] Vector1 = new double[arraySize];
		double[] Vector2 = new double[arraySize];
		double[] VectorTotal = new double[arraySize];
		
		// Get values for Vector1
		Print("Enter values for Vector1");
		while(i < arraySize) {
			userInput = console.nextLine();
			if(isNumericDouble(userInput)) {
				userInputDouble = Double.parseDouble(userInput);
				Vector1[i] = userInputDouble;
				i++;
			} else {
				Print("Invalid input. Please enter a valid number Ex.(1.0).");
			}
		}
		
		i = 0;
		
		// Get values for Vector2
		Print("Enter values for Vector2");
		while(i < arraySize) {
			userInput = console.nextLine();
			if(isNumericDouble(userInput)) {
				userInputDouble = Double.parseDouble(userInput);
				Vector2[i] = userInputDouble;
				i++;
			} else {
				Print("Invalid input. Please enter a valid number Ex.(1.0).");
			}
		}
		
		i = 0;	
		
		// Add vectors
		while(i < arraySize) {
			VectorTotal[i] = Vector1[i] + Vector2[i];
			i++;
		}
		
		// Display result
		displayVector(Vector1, Vector2, VectorTotal, "+");
	}
	
	// Method for subtracting two vectors
	public static void subbtractVectors() {
		Print("Enter the size of the Vectors");
		String userInput = "";
		Double userInputDouble = 0.0;
		int arraySize = 0;
		int i = 0;
		
		// Get the size of the vectors from the user
		while(true) {
			userInput = console.nextLine();
			if(isNumericIntVector(userInput)) {
				if (Integer.parseInt(userInput) >= 1) {
					arraySize = Integer.parseInt(userInput);
					break;
				}
			} else {
				Print("Invalid input. Please enter a valid number Ex.(1).");
			}
		}
		
		// Initialize vectors
		double[] Vector1 = new double[arraySize];
		double[] Vector2 = new double[arraySize];
		double[] VectorTotal = new double[arraySize];
		
		// Get values for Vector1
		Print("Enter values for Vector1");
		while(i < arraySize) {
			userInput = console.nextLine();
			if(isNumericDouble(userInput)) {
				userInputDouble = Double.parseDouble(userInput);
				Vector1[i] = userInputDouble;
				i++;
			} else {
				Print("Invalid input. Please enter a valid number Ex.(1.0).");
			}
		}
		
		i = 0;
		
		// Get values for Vector2
		Print("Enter values for Vector2");
		while(i < arraySize) {
			userInput = console.nextLine();
			if(isNumericDouble(userInput)) {
				userInputDouble = Double.parseDouble(userInput);
				Vector1[i] = userInputDouble;
				i++;
			} else {
				Print("Invalid input. Please enter a valid number Ex.(1.0).");
			}
		}
		
		i = 0;	
		
		// Subtract vectors
		while(i < arraySize) {
			VectorTotal[i] = Vector1[i] - Vector2[i];
			i++;
		}
		
		// Display result
		displayVector(Vector1, Vector2, VectorTotal, "-");
	}
	
	// Method for calculating vector magnitude
	public static void magnitudeVectors() {
		Print("Enter the size of the Vectors");
		String userInput = "";
		Double userInputDouble = 0.0;
		Double Magnitude = 0.0;
		int arraySize = 0;
		int i = 0;
		
		// Get the size of the vector from the user
		while(true) {
			userInput = console.nextLine();
			if(isNumericIntVector(userInput)) {
				arraySize = Integer.parseInt(userInput);
				break;
			} else {
				Print("Invalid input. Please enter a valid number Ex.(1).");
			}
		}
		
		// Initialize vector
		double[] Vector1 = new double[arraySize];
		
		// Get values for Vector1
		Print("Enter values for Vector1");
		while(i < arraySize) {
			userInput = console.nextLine();
			if(isNumericDouble(userInput)) {
				userInputDouble = Double.parseDouble(userInput);
				Vector1[i] = userInputDouble;
				i++;
			} else {
				Print("Invalid input. Please enter a valid number Ex.(1.0).");
			}
		}
		
		// Square each element and sum them
		for(int x = 0; x < arraySize; x++) {
			Magnitude += Math.pow(Vector1[x], 2);
		}
		
		// Square root the sum
		Magnitude = Math.sqrt(Magnitude);
		
		// Display magnitude 
		displayVector(Magnitude);
	}
	
	public static void main(String[] args) {	
		String userInput = "";
		int userInputInt = 0;
		
		// Process user input in a loop until user chooses to quit
		while(true) {
			// Display welcome message and menu
			Print("Welcome to the Vector Operations Program! \n" +
				  "Enter 1. To Add 2 Vectors \n" +
				  "Enter 2. To Subtract 2 Vectors \n" +
				  "Enter 3. To Find the Magnitude of a Vector \n" + 
				  "Enter 9. To Quit");
			userInput = console.nextLine();
			if(isNumericInt(userInput)) {
				userInputInt = Integer.parseInt(userInput);
			} else {
				Print("Invalid input. Please enter a valid number (1, 2, 3, or 9).");
			}
			
			// Perform selected operation based on user input
			if (userInputInt == 1) {
				addVectors();
			} else if (userInputInt == 2) {
				subbtractVectors();
			} else if (userInputInt == 3) {
				magnitudeVectors();
			} else if (userInputInt == 9){
				Print("Goodbye");
				break;
			}
		}
	}
}
