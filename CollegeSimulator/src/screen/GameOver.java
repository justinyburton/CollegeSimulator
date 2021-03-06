package screen;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import acm.graphics.GLabel;
import game.Game;
import system.Player;

public class GameOver extends Screen {
	
	private static final long serialVersionUID = 4025229043284954824L;
	private final String loss = "Game Over";
	
	@SuppressWarnings("unused")
	private Game game;
	private JButton newGameButton;
	private Font titleFont;
	private GLabel titleLabel;
	private Font buttonFont;
	
	private GLabel score;
	
	public GameOver(Game game) {
		super(game);

		//Create the title font
		titleFont = new Font(Font.SERIF, Font.BOLD, 60);
		
		//Create and add the title label
		titleLabel = new GLabel(loss, Game.X_UNIT * 5.2, Game.Y_UNIT * 4);
		titleLabel.setFont(titleFont);
		this.add(titleLabel);
		
		//Create and add score label
		score = new GLabel("You survived " + game.getTime().getDays() + " days.");
		this.add(score,  Game.X_UNIT * 5, Game.Y_UNIT * 6);
		
		//Create the font for the button
		buttonFont = new Font(Font.SERIF, Font.BOLD, 30);
		
		//Create and add new game button
		newGameButton = new JButton("New Game");
		newGameButton.setFont(buttonFont);
		newGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				game.setPlayer(new Player());
				game.changeScreen(new AvatarBuilder(game));
			}
			
		});
		newGameButton.setBounds(Game.X_UNIT * 5, Game.Y_UNIT * 5, Game.X_UNIT * 2, Game.Y_UNIT);
		this.add(newGameButton);
	}

}
