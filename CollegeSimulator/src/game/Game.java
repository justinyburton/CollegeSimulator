package game;

import acm.graphics.GCanvas;
import acm.program.GraphicsProgram;
import screen.Menu;
import system.Avatar;

public class Game extends GraphicsProgram {

	private static final long serialVersionUID = 7059646278559620203L;
	public static final int SCREEN_WIDTH = 1920;
	public static final int SCREEN_HEIGHT = 1080;
	public static final int X_UNIT = SCREEN_WIDTH / 12;
	public static final int Y_UNIT = SCREEN_HEIGHT / 12;
	private Avatar avatar;
	
	public void run() {
		this.add(new Menu(this));
		this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
	}
	
	public void changeCanvas(GCanvas canvas) {
		this.removeAll();
		this.add(canvas);
	}
	
}
