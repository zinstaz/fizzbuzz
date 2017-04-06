package hu.p92.fizzbuzz;

import java.util.List;

public class JsonFormatter implements Formatter {

	@Override
	public String format(List<Object> input) {

		StringBuilder result = new StringBuilder("[");
		
		for (Object object : input) {
			result.append("\"");
			result.append(object.toString());
			result.append("\"");
			result.append(",");
		}

		return result.toString().replaceAll(",$", "]");
		
	}

}
