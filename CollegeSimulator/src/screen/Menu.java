package screen;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import acm.graphics.GLabel;
import game.Game;
//import system.Avatar;

public class Menu extends Screen {
	
	private static final long serialVersionUID = 4025229043284954823L;
	private final String gameName = "College Simulator";
	
	@SuppressWarnings("unused")
	private Game game;
	private JButton newGameButton;
	private Font titleFont;
	private GLabel titleLabel;
	private Font buttonFont;
	
	public Menu(Game game) {
		
		super(game);
		
		//Create the title font
		titleFont = new Font(Font.SERIF, Font.BOLD, 60);
		
		//Create and add the title label
		titleLabel = new GLabel(gameName, Game.X_UNIT * 4.62, Game.Y_UNIT * 4);
		titleLabel.setFont(titleFont);
		this.add(titleLabel);
		
		//Create the font for the button
		buttonFont = new Font(Font.SERIF, Font.BOLD, 30);
		
		//Create and add new game button
		newGameButton = new JButton("New Game");
		newGameButton.setFont(buttonFont);
		newGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				game.changeScreen(new AvatarBuilder(game));
			}
			
		});
		newGameButton.setBounds(Game.X_UNIT * 5, Game.Y_UNIT * 5, Game.X_UNIT * 2, Game.Y_UNIT);
		this.add(newGameButton);
		
	}
	
}
