package hu.p92.fizzbuzz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class DefaultFizzBuzzEngine implements FizzBuzzEngine {

	@Override
	public List<Object> process(Range range, Set<NumberPattern> numberPatterns) {

		List<Object> result = new ArrayList<Object>();
		
		List<NumberPattern> sortedList = new ArrayList<NumberPattern>(numberPatterns);
		Collections.sort(sortedList);
		Collections.reverse(sortedList);

		for (int i = range.getMinValue(); i <= range.getMaxValue(); i++) {

			Object output = null;
			
			for (NumberPattern numberPattern : sortedList) {
				if (i % numberPattern.getNumber() == 0) {
					output = numberPattern.getOutput();
					break;
				}
			}
			
			result.add(output != null ? output : i);
			
		}
		
		return result;
	
	}

}
