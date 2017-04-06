package hu.p92.fizzbuzz;

import java.util.Set;

public class FizzBuzzApp {

	private final FizzBuzzEngine engine;
	private final Formatter formatter;
	
	public FizzBuzzApp(FizzBuzzEngine engine, Formatter formatter) {
		super();
		this.engine = engine;
		this.formatter = formatter;
	}

	public String getResults(Range range, Set<NumberPattern> numberPatterns) {
		return formatter.format(engine.process(range, numberPatterns));
	}
	
}
