package screen;

import java.awt.Color;

import javax.swing.JButton;

import acm.graphics.GCanvas;
import game.Game;

public class Menu extends GCanvas {
	
	private static final long serialVersionUID = 4025229043284954823L;
	
	private Game game;
	JButton newGameButton;
	
	public Menu(Game game) {
		
		this.game = game;
		this.setBounds(-Game.SCREEN_WIDTH, 0, Game.SCREEN_WIDTH, Game.SCREEN_HEIGHT);
		this.setBackground(Color.BLUE);
		
		//JButton newGameButton = new JButton("New Game");
		
		//newGameButton.setSize(Game.X_UNIT, Game.Y_UNIT);
		//newGameButton.setLocation(-(newGameButton.getWidth() / 2), Game.Y_UNIT * 5);
		
		//this.add(newGameButton);
		
	}
	
}
