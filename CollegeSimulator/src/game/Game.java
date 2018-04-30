//Submitted by: Justin Burton
//Helped by: Chloe Fang
package game;

import java.awt.Color;

import acm.program.GraphicsProgram;
import screen.Menu;
import screen.Screen;
import system.Event;
import system.Player;
import system.Time;

public class Game extends GraphicsProgram {

	private static final long serialVersionUID = 7059646278559620203L;
	public static final int SCREEN_WIDTH = 1920;
	public static final int SCREEN_HEIGHT = 1080;
	public static final int X_UNIT = SCREEN_WIDTH / 12;
	public static final int Y_UNIT = SCREEN_HEIGHT / 12;
	public static final Color BACKGROUND_COLOR = new Color(245, 245, 220);
	
    public static Event SLEEP;
    public static Event STUDY;
    public static Event GO_TO_CLASS;
    public static Event EAT;
	
	private Player player;
	private Time time;
	
	public void run() {

		this.time = new Time();
		this.time.changeTime(0, 6, 0);
		
		SLEEP = new Event(this, 1, 20, -10, 50, 20, 0, 0, 0, 0);
		STUDY = new Event(this, 1, -20, 10, -20, 30, 0.001, 1, 0, 0);
		GO_TO_CLASS = new Event(this, 1, -15, 10, -20, 20, 0.001, 0, 0, 0);
		EAT = new Event(this, 1, 10, -5, -10, -30, 0, 0, -10, 0);
		
		this.player = new Player();
		this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		this.add(new Menu(this), 0, 0);
	}
	
	public void changeScreen(Screen screen) {
		this.removeAll();
		this.add(screen, 0, 0);
	}

	public Player getPlayer() {
		return player;
	}

	public Time getTime() {
		return time;
	}
	
}
