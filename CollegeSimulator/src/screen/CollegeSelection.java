package screen;

import java.awt.Color;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import game.Game;
import system.College;
import system.Major;

public class CollegeSelection extends Screen {
	
	private static final long serialVersionUID = 7435310449856598566L;
	
	private GLabel SULabel;
	
	public CollegeSelection(Game game) {
		
		super(game);
		
		System.out.println("College selection screen generated.");
		this.setBackground(Color.RED);
		
		SULabel = new GLabel(College.SU.toString(), Game.X_UNIT, Game.Y_UNIT);
		this.add(SULabel);
		this.add(College.SU, Game.X_UNIT, Game.Y_UNIT * 2);
		
	}
	
}
