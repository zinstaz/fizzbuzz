package hu.p92.fizzbuzz;

public class Range {

	private final int minValue;
	private final int maxValue;
	
	public Range(int minValue, int maxValue) {
		
		super();
		
		if (maxValue < minValue) {
			throw new IllegalArgumentException("'Max value' cannot be smaller than 'Min value'!");
		}
		
		this.minValue = minValue;
		this.maxValue = maxValue;
		
	}

	public int getMinValue() {
		return minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}
	
}
