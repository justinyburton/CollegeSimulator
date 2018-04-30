package screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import game.Game;

public class ClassroomScreen extends GamePlay {

	public ClassroomScreen(Game game) {
		super(game);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String eventText() {
		return getGame().getPlayer().getCurrentLocation().getEventText();
	}

	@Override
	public JButton[] options() {
		
		JButton goElsewhere = new JButton("Go Elsewhere");
		
		goElsewhere.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getGame().changeScreen(new LocationSelector(getGame()));
			}
			
		});
		
		JButton sleepButton = new JButton("Go to Class for 1 Hour");
		
		sleepButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Game.GO_TO_CLASS.doAction();
			}
			
		});
		
		return new JButton[] {goElsewhere, sleepButton};
		
	}

}
