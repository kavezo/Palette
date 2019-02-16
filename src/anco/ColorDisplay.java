package anco;

public class ColorDisplay {

	final int n;
	float[] ratios;
	String[] names;
	RGBColor[] colors;
	
	public ColorDisplay(int n) {
		this.n = n;
	}
	
	public static ColorDisplay fromRGB(int rgb, String model) {
		RGBColor color = new RGBColor(rgb);
		Color new_color = color.convertTo(model);
		return new_color.display();
	}
}
