package hu.p92.fizzbuzz;

import java.util.List;

public class LineFormatter implements Formatter {

	@Override
	public String format(List<Object> input) {

		StringBuilder result = new StringBuilder("");
		
		for (Object object : input) {
			result.append(object.toString());
			result.append("\n");
		}
	
		return result.toString();
		
	}

}
