package hu.p92.fizzbuzz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FizBuzzDemo {

	public static void main(String[] args) {
	
		// default
		FizzBuzzApp defaultFizzBuzzApp = new FizzBuzzApp(new DefaultFizzBuzzEngine(), new LineFormatter());
		
		Range range1 = new Range(7, 33);
		Set<NumberPattern> numberPatterns1 = new HashSet<NumberPattern>(Arrays.asList(
													new NumberPattern(15, "FizzBuzz"), 
													new NumberPattern(5, "Buzz"), 
													new NumberPattern(3, "Fizz"))); 
		
		System.out.println(defaultFizzBuzzApp.getResults(range1, numberPatterns1)); 
		
		// json
		FizzBuzzApp jsonFizzBuzzApp = new FizzBuzzApp(new DefaultFizzBuzzEngine(), new JsonFormatter());
		
		Range range2 = new Range(1, 90);
		Set<NumberPattern> numberPatterns2 = new HashSet<NumberPattern>(Arrays.asList(
													new NumberPattern(15, "FizzBuzz"), 
													new NumberPattern(5, "Buzz"), 
													new NumberPattern(7, "Bar"), 
													new NumberPattern(3, "Fizz"))); 
		
		System.out.println(jsonFizzBuzzApp.getResults(range2, numberPatterns2)); 
		
	}
	
}
