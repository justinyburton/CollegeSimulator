package screen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import game.Game;
//import system.Avatar;

public class Menu extends Screen {
	
	private static final long serialVersionUID = 4025229043284954823L;
	
	@SuppressWarnings("unused")
	private Game game;
	JButton newGameButton;
	
	public Menu(Game game) {
		
		super(game);
		
		this.setBackground(Color.BLUE);
		
		JButton newGameButton = new JButton("New Game");
		newGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//game.changeCanvas(new AvatarBuilder(new Avatar(50, 50), game));
				game.changeScreen(new CollegeSelection(game));
			}
			
		});
		
		newGameButton.setBounds(Game.X_UNIT * 5, Game.Y_UNIT * 5, Game.X_UNIT * 2, Game.Y_UNIT);
		
		this.add(newGameButton);
		
	}
	
}
