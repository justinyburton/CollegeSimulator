package game;

import acm.program.GraphicsProgram;
import screen.Menu;

public class Game extends GraphicsProgram {

	private static final long serialVersionUID = 7059646278559620203L;
	
	public void run() {
		this.add(new Menu());
	}
	
}
