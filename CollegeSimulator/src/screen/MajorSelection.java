package screen;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;

import acm.graphics.GLabel;
import game.Game;
import system.Major;

public class MajorSelection extends Screen {
	
	private static final long serialVersionUID = 2551962708441066128L;
	
	private Font titleFont;
	private GLabel titleLabel;
	
	public MajorSelection(Game game) {
		
		super(game);
		
		//This creates the title font.
		titleFont = new Font(Font.SERIF, Font.BOLD, 40);
		
		//This creates the label at the top.
		titleLabel = new GLabel("Select Your Major", Game.X_UNIT * 5, Game.Y_UNIT);
		titleLabel.setFont(titleFont);
		this.add(titleLabel);
		
		//The following lines create the labels representing each label
		for (int i = 0; i < Major.ALL_MAJORS.length; i++) {
			
			Major major = Major.ALL_MAJORS[i];
			
			String majorText = "<html><div style=\"font-size: 10px;margin-top: -10px;\"><p style=\"font-size: 20px;font-weight: bold;\">" +
					major.toString() + (game.getPlayer().getCollege().hasSpecialty(major) ? " [Specialty]" : "") +
					"</p><p style=\"margin-top: -10px;\"><strong>Difficulty:</strong> " + major.getDifficulty() + " / 100" +
					"</p><p style=\"margin-top: -10px;\"><strong>Total Credits:</strong> " + major.getCredits() +
					"</p></div></html>";
			
			JEditorPane majorPane = new JEditorPane("text/html", majorText);
			majorPane.setEditable(false);
			majorPane.setBackground(Game.BACKGROUND_COLOR);
			majorPane.setBounds(Game.X_UNIT * 5, (int) (Game.Y_UNIT * (i + 1.5)), Game.X_UNIT * 3, Game.Y_UNIT);
			this.add(majorPane);
			
			JButton majorSelector = new JButton("Select " + major.toString());
			majorSelector.setBounds(Game.X_UNIT * 4, (int) (Game.Y_UNIT * (i + 1.7)), Game.X_UNIT, (int) (Game.Y_UNIT * 0.8));
			majorSelector.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					game.getPlayer().setMajor(major);
					game.getPlayer().changeParentalApproval(major.getPrestige() - 50);
					game.changeScreen(new CourseSelection(game));
					
				}
				
			});
			this.add(majorSelector);
		}
		
	}

}
