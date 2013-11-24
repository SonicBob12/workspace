
public class Factors30 {
    // Factors array is to store the proper factors of the number under consideration.
	// It is defined for 30 elements because, at most, the largest number 30 can have 30 factors
	static int [] factors = new int[30];

	public static void main(String[] args) {
		// Below is the loop that generates the candidate numbers
		for (int number=2; number <= 30; number++) {
			// print out the number under consideration
			System.out.println("Number: " + number);
			// since we have a new candidate zero out the factors of the previous number
			// TODO: write a for loop to zero out the factors array
			//    YOUR FOR LOOP GOES HERE
			// now determine the factors of number.
			// count variable will "count" the number of factors
			int count = 0;
			// TODO: write another for loop that tests possible factors using the modulus % operator
			//       if you find a proper factor store it in the factors array so it can be printed later
			//       also increment the count variable.
			//    YOUR FOR LOOP GOES HERE			
			// at this point have found the factors of number
			// TODO: print the factors of the number.  Requires another for loop.
			//    YOUR FOR LOOP GOES HERE
			// if there is just one proper factor then the number is prime.
			// TODO: print if the number is prime.
			//    YOUR IF STATEMENT GOES HERE
			// compute the sum of the factors. 
			// sum variable will contain the sum of the proper factors
			int sum = 0;
			// TODO: compute the sum of the factors
			//    YOUR FOR LOOP GOES HERE			
			// if the sum==number the number is perfect
			// TODO: test if the number is perfect.  If it is print it.
			//    YOUR IF STATEMENT GOES HERE
		}
	}
	
	
	
}
