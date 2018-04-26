package screen;

import acm.graphics.GCanvas;
import system.College;
import system.Major;

public class CollegeSelection extends GCanvas {
	
	private static final long serialVersionUID = 7435310449856598566L;
	
	public CollegeSelection() {
		
		final double widthUnit = this.getWidth() / 9;
		final double heightUnit = this.getHeight() / 9;
		
		this.add(College.SU);
		
	}
	
}
