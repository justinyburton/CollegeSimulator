package game;

import acm.program.GraphicsProgram;
import screen.Menu;

public class Game extends GraphicsProgram {

	private static final long serialVersionUID = 7059646278559620203L;
	private Character avatar;
	
	public void run() {
		this.add(new Menu());
	}
	
}
