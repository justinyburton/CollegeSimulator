package game;

import acm.program.GraphicsProgram;
import screen.Menu;
import system.Avatar;

public class Game extends GraphicsProgram {

	private static final long serialVersionUID = 7059646278559620203L;
	public static final int SCREEN_WIDTH = 1920;
	public static final int SCREEN_HEIGHT = 1080;
	public static final int xUnit = SCREEN_WIDTH / 12;
	public static final int yUnit = SCREEN_HEIGHT / 12;
	private Avatar avatar;
	
	public void run() {
		this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		this.add(new Menu());
	}
	
}
