package anco;

public class RGBColor extends Color {
	
	public RGBColor(int r, int g, int b) {
		super(3);
		this.color = new float[]{r,g,b};
	}
	
	public RGBColor(int rgb) {
		super(3);
		this.color = new float[this.n];
		
		this.color[0] = rgb >> 4;
		this.color[1] = (rgb >> 2) & 3;
		this.color[2] = rgb & 3;
	}

	@Override
	public Color convertTo(String other) {
		switch(other) {
			case "rgb":
				return this;
			default:
				throw new RuntimeException("Unknown color model type " + other);
		}
	}

	@Override
	public ColorDisplay display() {
		ColorDisplay cd = new ColorDisplay(this.n);
		return cd;
	}

}
