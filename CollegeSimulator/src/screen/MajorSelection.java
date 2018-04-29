package screen;

import java.awt.Font;

import acm.graphics.GLabel;
import game.Game;

public class MajorSelection extends Screen {
	
	private static final long serialVersionUID = 2551962708441066128L;
	
	private Font titleFont;
	private GLabel titleLabel;
	
	public MajorSelection(Game game) {
		
		super(game);
		
		//This creates the title font.
		titleFont = new Font(Font.SERIF, Font.BOLD, 40);
		
		//This creates the label at the top.
		titleLabel = new GLabel("Select Your Major", Game.X_UNIT * 5, Game.Y_UNIT);
		titleLabel.setFont(titleFont);
		this.add(titleLabel);
		
	}

}
