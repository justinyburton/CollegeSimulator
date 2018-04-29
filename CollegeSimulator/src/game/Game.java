package game;

import java.util.concurrent.TimeUnit;

import acm.program.GraphicsProgram;
import screen.Menu;
import screen.Screen;
import system.Avatar;

public class Game extends GraphicsProgram {

	private static final long serialVersionUID = 7059646278559620203L;
	public static final int SCREEN_WIDTH = 1920;
	public static final int SCREEN_HEIGHT = 1080;
	public static final int X_UNIT = SCREEN_WIDTH / 12;
	public static final int Y_UNIT = SCREEN_HEIGHT / 12;
	Avatar avatar;
	
	public void run() {
		this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		this.add(new Menu(this), 0, 0);
	}
	
	public void changeScreen(Screen screen) {
		this.removeAll();
		this.add(screen, 0, 0);
	}
	
}
