package hu.p92.fizzbuzz;

import java.util.List;
import java.util.Set;

public interface FizzBuzzEngine {

	List<Object> process(Range range, Set<NumberPattern> numberPatterns);
	
}
