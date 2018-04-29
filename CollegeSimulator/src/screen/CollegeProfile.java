package screen;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;

import acm.graphics.GLabel;
import game.Game;
import system.College;

public class CollegeProfile extends Screen {
	
	private static final long serialVersionUID = -3305572562587920669L;
	private Font titleFont;
	private Font descriptionFont;
	private Font buttonFont;
	private GLabel title;
	@SuppressWarnings("unused")
	private College college;
	private String majors;
	private JEditorPane stats;
	private String statsString;
	private JTextArea description;
	private JButton back;
	private JButton select;
	
	public CollegeProfile(Game game, College college) {
		super(game);
		//Adding the college image
		this.college = college;
		this.add(college, Game.X_UNIT * 1.3, Game.Y_UNIT * 1.3);
		
		//Creating the font for the title
		titleFont = new Font(Font.SERIF, Font.BOLD, 70);
		
		//Creating and adding the title.
		title = new GLabel(college.toString(), Game.X_UNIT * 4, Game.Y_UNIT * 1.5);
		title.setFont(titleFont);
		this.add(title);
		
		//Creating the text for statistics
		majors = new String();
		int i;
		for (i = 0; i < college.getSpecialties().length - 1; i++) {
			majors += college.getSpecialties()[i].toString() + ", ";
		}
		majors += college.getSpecialties()[i].toString();
		
		statsString = "<html><div style=\"font-size: 20px;\"><p style=\"font-size: 30px;font-weight: bold;\">Statistics" +
		"</p><p style=\"margin-top: -10px;\"><strong>Prestige:</strong> " + college.getPrestige() + " / 100" +
		"</p><p style=\"margin-top: -10px;\"><strong>Acceptance Rate:</strong> " + college.getAcceptanceRate() + "%" +
		"</p><p style=\"margin-top: -10px;\"><strong>Difficulty:</strong> " + college.getDifficulty() + " / 100" +
		"</p><p style=\"margin-top: -10px;\"><strong>Tuition:</strong> $" + college.getTuition() + " per year" +
		"</p><p style=\"margin-top: -10px;\"><strong>Specialties:</strong> " + majors + "</p></div></html>";
		
		//Creating and adding the statistics text pane.
		stats = new JEditorPane("text/html", statsString);
		stats.setBounds(Game.X_UNIT * 4, (int) (Game.Y_UNIT * 1.7), Game.X_UNIT * 7, Game.Y_UNIT * 3);
		this.add(stats);
		
		//Creating the description font.
		descriptionFont = new Font(Font.SERIF, Font.PLAIN, 30);
		
		//Creating and adding the description text pane.
		description = new JTextArea(college.getDescription());
		description.setBounds(Game.X_UNIT, Game.Y_UNIT * 5, Game.X_UNIT * 10, Game.Y_UNIT * 4);
		description.setLineWrap(true);
		description.setWrapStyleWord(true);
		description.setFont(descriptionFont);
		this.add(description);
		
		//Creating the button font
		buttonFont = new Font(Font.SERIF, Font.BOLD, 20);
		
		//Creating and adding the back button.
		back = new JButton("Back To College Selection");
		back.setFont(buttonFont);
		back.setBounds(Game.X_UNIT * 2, Game.Y_UNIT * 10, Game.X_UNIT * 2, Game.Y_UNIT);
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				game.changeScreen(new CollegeSelection(game));
			}
			
		});
		this.add(back);
		
		//Creating and adding the select button.
		select = new JButton("Select " + college);
		select.setFont(buttonFont);
		select.setBounds(Game.X_UNIT * 7, Game.Y_UNIT * 10, Game.X_UNIT * 3, Game.Y_UNIT);
		select.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				game.getPlayer().selectCollege(college);
				game.changeScreen(new CollegeSelection(game));
			}
			
		});
		this.add(select);
		
	}
	
}
