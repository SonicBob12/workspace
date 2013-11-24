// These are classes from standard java library packages

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrintingAndConversions {

	public static void main(String[] args) {

		// The next lines show the declaration of two primitive types and their

		// initialization with numeric literals.

		short sh = 2;

		int in = 3;

		// Now we create reference types (wrapper types) for the same values.

		// Notice that the wrapper type for 'int' is 'Integer'.

		// Q1: What benefits come from having a reference type for Integer?
		// A1: It has its own class and there for a program cannot access the internal methods of Integer
		// 		But more importantly, the class provides several methods for converting
		//		int to a String and String to an int.
		//		and generally, the Integer class wraps a value of the primitive type int in an object.
		Short sh1 = new Short((short) 2);

		Integer in1 = new Integer(3);

		// Now we assign a short value to an int value.

		in = sh;

		// And now we assign an int value to a short value.

		// The cast (short) is necessary as you are assigning a 32-bit value to
		// a 16-bit value.

		// Q2: Why is this cast needed?
		// A2: Assigning a 32-bit value with a 16-bit value
		// 		is a narrowing operation.  The cast is needed
		//		in order to appease the javac.
		// 		

		// Q3: What happens if you remove it?
		// A3: A type mismatch error (cannot convert from int to short)
		//		appears and prevents the program from running.
		// 		 
		sh = (short) in;
		// sh = in;
		// The next lines show the difference between println, print, printf
		// methods each of which
		
		System.out.println("println sh returns: " + sh);
		System.out.println("println in returns: " + in);
		
		System.out.print("print sh returns: " + sh + " ");
		System.out.print("print in returns: " + in + " ");
		System.out.println();
		System.out.println();
		System.out.printf("printf sh returns: " + sh + " ");	
		System.out.printf("printf in returns: " + in + " ");
		System.out.println();

		
		// is important for outputting values to the command line.

		System.out.println("print primitive values:");

		// The parameter to println is String type. The + operator here means
		// concatenation,

		// not addition.

		// Q4: How can java concatenate a string with a short?
		// A4: When a short is printed to the console window its
		//		its converted to a string...
		//
		System.out.println("sh: " + sh);

		System.out.println("in: " + in);

		System.out.print("sh: " + sh);

		System.out.print(" in: " + in);

		// Q5: What does println with empty parameters do?
		// A5: It causes a carriage return. Two in a row, will produce two
		//		carriage consecutively, leaving a blank line.

		System.out.println();
		System.out.println();

		System.out.printf("sh: %d  in: %d\n", sh, in);
		System.out.println("whats above?");

		// Conversions: String to int followed by String to Integer

		// Q6: What's the difference between parseInt and valueOf methods?
		// A6: valueOf is returning a new Integer() object. parseInt returns
		// 		int, which is a primitive type.

		int five = Integer.parseInt("5");

		Integer five1 = Integer.valueOf("5");

		// Print out the values using printf and a format string followed by the
		// parameter.

		// Q7: What does %d mean in the format string?
		// A7: Its assigning a part of the string to be concatenated to the respective
		// objects being sent to the console window.

		System.out.printf("five: %d\n", five);

		// Q8: What effect does \n have at the end of the formatting string?
		// A8: Causes a carriage return before a subsequent print statement.

		System.out.printf("Integer(5): %s\n", five1);

		// Now read in string values and convert to short and int values.

		// Don't try to understand the next line. Prior to java 1.5 you had to
		// read strings

		// (actually entire lines) in this fashion. It turns out that although
		// System.out

		// has methods that can be used immediately, the methods of System.in
		// are too low-level.

		// So InputStreamReader and BufferedReader increase the level of
		// functionality.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// In a perfect world there would be no I/O exceptions and the try/catch
		// block below

		// would not be needed. But we don't live in a perfect world.

		String line = "";

		try {

			// Let's show a prompt so the user knows that input is expected.

			System.out.println("Enter int value: ");

			// Q9: what value is assigned to the variable line?

			line = br.readLine();

		} catch (IOException e) {

			// Let's terminate the program if an IOException happens.

			System.exit(1);

		}

		// Everything from the command line enters as a String type. Convert
		// String to int.

		in = Integer.parseInt(line);

		// Now print out the value that was entered.

		System.out.printf("Number entered: %d\n", in);

		// Since the last 10 lines are painful, a new class called Scanner was
		// introduced with java 1.5.

		// Let's use it and see how it makes things easier.

		// Q10: Why do we have to create a 'new' Scanner object here?

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter int value: ");

		in = scan.nextInt();

		// Again print out the value that was entered.

		System.out.printf("Number entered: %d\n", in);

	}

}