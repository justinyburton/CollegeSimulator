package screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			options[0].addActionListener(new StayListener(getGame().getPlayer().getCurrentLocation()));
		}
		if (!getGame().getPlayer().getCurrentLocation().equals(Location.DORM)) {
			options[1] = new JButton(Location.DORM.toString());
		} else {
			options[1] = new JButton("Stay");
			options[1].addActionListener(new StayListener(getGame().getPlayer().getCurrentLocation()));
		}
		if (!getGame().getPlayer().getCurrentLocation().equals(Location.CLASSROOM)) {
			options[2] = new JButton(Location.CLASSROOM.toString());
		} else {
			options[2] = new JButton("Stay");
			options[2].addActionListener(new StayListener(getGame().getPlayer().getCurrentLocation()));
		}
		if (!getGame().getPlayer().getCurrentLocation().equals(Location.DINING_HALL)) {
			options[3] = new JButton(Location.DINING_HALL.toString());
		} else {
			options[3] = new JButton("Stay");
			options[3].addActionListener(new StayListener(getGame().getPlayer().getCurrentLocation()));
		}
		return options;
	}
	
	public class StayListener implements ActionListener {
		
		private Location currentLocation;
		
		public StayListener(Location currentLocation) {
			this.currentLocation = currentLocation;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (currentLocation.equals(Location.DORM)) {
				getGame().changeScreen(new DormScreen(getGame()));
			}
		}

	}
	
}
