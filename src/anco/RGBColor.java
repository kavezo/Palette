package anco;

public class RGBColor extends Color {
	public static final RGBColor RED = new RGBColor(255, 0, 0);
	public static final RGBColor GREEN = new RGBColor(0, 255, 0);
	public static final RGBColor BLUE = new RGBColor(0, 0, 255);
	
	public RGBColor(int r, int g, int b) {
		super(3);
		this.color = new float[]{r,g,b};
	}
	
	public RGBColor(int rgb) {
		super(3);
		this.color = new float[this.n];
		
		this.color[0] = rgb >> 16;
		this.color[1] = (rgb >> 8) & 255;
		this.color[2] = rgb & 255;
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
		float total = this.color[0] + this.color[1] + this.color[2];
		cd.ratios = new float[]{this.color[0]/total, this.color[1]/total, this.color[2]/total};
		cd.names = new String[]{"Red", "Green", "Blue"};
		cd.colors = new RGBColor[]{RED, GREEN, BLUE};
		return cd;
	}
	
	public String toString() {
		return "[R: " + this.color[0] + ", G: " + this.color[1] + ", B: " + this.color[2] + "]";
	}
}
