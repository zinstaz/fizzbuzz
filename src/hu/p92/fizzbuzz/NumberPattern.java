package hu.p92.fizzbuzz;

public class NumberPattern implements Comparable<NumberPattern> {

	private final int number;
	private final String output;

	public NumberPattern(int number, String output) {
		super();
		this.number = number;
		this.output = output;
	}

	public int getNumber() {
		return number;
	}

	public String getOutput() {
		return output;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberPattern other = (NumberPattern) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public int compareTo(NumberPattern o) {
		return this.number - o.getNumber();
	}
	
}
