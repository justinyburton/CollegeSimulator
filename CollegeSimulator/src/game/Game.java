package game;

import acm.program.GraphicsProgram;
import screen.Menu;
import system.Avatar;

public class Game extends GraphicsProgram {

	private static final long serialVersionUID = 7059646278559620203L;
	private Avatar avatar;
	
	public void run() {
		this.add(new Menu());
	}
	
}
