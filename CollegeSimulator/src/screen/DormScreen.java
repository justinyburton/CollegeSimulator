package screen;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import game.Game;

public class DormScreen extends GamePlay {
	
	private static final long serialVersionUID = 7126677489777536203L;

	public DormScreen(Game game) {
		super(game);
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
		
		JButton sleepButton = new JButton("Sleep for 1 Hour");
		
		sleepButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Game.SLEEP.doAction();
			}
			
		});
		
		return new JButton[] {goElsewhere, sleepButton};
		
	}

	@Override
	public String eventText() {
		return getGame().getPlayer().getCurrentLocation().getEventText();
	}
	
}
