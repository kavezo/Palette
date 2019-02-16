package anco;

public abstract class Color {
	protected final int n;
	protected float[] color;
	
	Color(int new_n) {
		n = new_n;
	}
	
	public int getRank() {
		return this.n;
	}
	
	public void setValues(float... values) {
		if (values.length != n) {
			throw new java.lang.RuntimeException("Incorrect number of values for " + 
												this.getClass().getName() + 
												"; expected " + n + ", got " + values.length);
		}
		for (int i=0; i<values.length; i++) {
			this.color[i] = values[i];
		}
	}
	
	public abstract Color convertTo(String other);
	public abstract ColorDisplay display();
}
