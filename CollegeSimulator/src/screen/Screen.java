package screen;

import acm.graphics.GCanvas;
import game.Game;

public abstract class Screen extends GCanvas {
	
	/*
	 * This class is the superclass for all screens used in College Simulator.
	 * This sets the size for and gives the game object to all screens.
	 */
	
	private static final long serialVersionUID = 6840440233352187584L;
	private Game game; //This is the game object, used to access the game itself.
	
	public Screen(Game game) {
		
		this.game = game; //Sets the game.
		this.setSize(Game.SCREEN_WIDTH, Game.SCREEN_HEIGHT); //Sets the screen size.
		this.setBackground(Game.BACKGROUND_COLOR);
		
	}

	public Game getGame() {
		return game;
	}
	
}
