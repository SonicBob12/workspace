
import java.util.Random;
import java.math.*;

public class Pythagoras {
public static void main(String[] args) {
	double a, b, c;
	
	Random gen = new Random();
	
	a = gen.nextInt(8) + 2;	// 2 to 10
	b = gen.nextInt(11)	+ 1;	// 1 to 12
	
	double aSquared = Math.pow(a, 2);
	double bSquared = Math.pow(b, 2);
	
	c = Math.sqrt(aSquared + bSquared);
	
	System.out.println("For a right triange with sides " + a + " and " + b);
	System.out.println("the hypotenuse is " + c);
	
}
	
	
}

