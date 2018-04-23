package screen;

import javax.swing.JButton;

import acm.graphics.GCanvas;

public class Menu extends GCanvas {
	
	private static final long serialVersionUID = 4025229043284954823L;
	
	JButton newGameButton;
	
	public Menu() {
		
		JButton newGameButton = new JButton("New Game");
		this.add(newGameButton);
		
	}
	
}
