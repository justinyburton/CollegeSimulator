package screen;

import java.awt.Color;
import java.awt.Font;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import game.Game;
import system.College;
import system.Major;

public class CollegeSelection extends Screen {
	
	private static final long serialVersionUID = 7435310449856598566L;
	
	private GLabel titleLabel;
	private GLabel SULabel;
	
	private Font titleFont;
	private Font collegeFont;
	
	public CollegeSelection(Game game) {
		
		super(game);
		
		System.out.println("College selection screen generated.");
		
		titleFont = new Font(Font.SERIF, Font.BOLD, 20);
		
		titleLabel = new GLabel("Select Your College", Game.X_UNIT * 5, Game.Y_UNIT);
		titleLabel.setFont(titleFont);
		this.add(titleLabel);
		
		SULabel = new GLabel(College.SU.toString(), Game.X_UNIT, Game.Y_UNIT * 2.5);
		this.add(SULabel);
		this.add(College.SU, Game.X_UNIT, Game.Y_UNIT * 3);
		
	}
	
}
