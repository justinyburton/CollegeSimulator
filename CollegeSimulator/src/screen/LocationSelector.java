package screen;

import javax.swing.JButton;
import game.Game;
import system.Location;

public class LocationSelector extends GamePlay {
	
	private static final long serialVersionUID = -8282768366517564065L;
	
	
	public LocationSelector(Game game) {
		super(game);
	}
	
	@Override
	public String eventText() {
		return "Where do you want to go?";
	}
	
	@Override
	public JButton[] options() {
		JButton[] options = new JButton[4];
		if (!getGame().getPlayer().getCurrentLocation().equals(Location.LIBRARY)) {
			options[0] = new JButton(Location.LIBRARY.toString());
		} else {
			options[0] = new JButton("Stay");
		}
		if (!getGame().getPlayer().getCurrentLocation().equals(Location.DORM)) {
			options[1] = new JButton(Location.DORM.toString());
		} else {
			options[1] = new JButton("Stay");
		}
		if (!getGame().getPlayer().getCurrentLocation().equals(Location.CLASSROOM)) {
			options[2] = new JButton(Location.CLASSROOM.toString());
		} else {
			options[2] = new JButton("Stay");
		}
		if (!getGame().getPlayer().getCurrentLocation().equals(Location.DINING_HALL)) {
			options[3] = new JButton(Location.DINING_HALL.toString());
		} else {
			options[3] = new JButton("Stay");
		}
		return options;
	}

}
