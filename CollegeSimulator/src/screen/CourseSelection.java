package screen;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;

import acm.graphics.GLabel;
import game.Game;
import system.Course;

public class CourseSelection extends Screen {
	
	private static final long serialVersionUID = -1317407256375694023L;
	
	private Font titleFont;
	private GLabel titleLabel;
	
	public CourseSelection(Game game) {
		
		super(game);
		
		//This creates the title font.
		titleFont = new Font(Font.SERIF, Font.BOLD, 40);
		
		//This creates the label at the top.
		titleLabel = new GLabel("Select Your Courses", Game.X_UNIT * 5, Game.Y_UNIT);
		titleLabel.setFont(titleFont);
		this.add(titleLabel);
		
		//The following lines create the labels representing each label
		for (int i = 0; i < Course.ALL_COURSES.length; i++) {
			
			Course course = Course.ALL_COURSES[i];
			
			if (!game.getPlayer().hasCompleted(course) || !game.getPlayer().isTaking(course)) {
				
				String courseText = "<html><div style=\"font-size: 10px;margin-top: -10px;\"><p style=\"font-size: 20px;font-weight: bold;\">" +
						course.toString() +
						"</p><p style=\"margin-top: -10px;\"><strong>Difficulty:</strong> " + course.getDifficulty() + " / 100" +
						"</p><p style=\"margin-top: -10px;\"><strong>Total Credits:</strong> " + course.getCredits() +
						"</p></div></html>";
				
				JEditorPane majorPane = new JEditorPane("text/html", courseText);
				majorPane.setBounds(Game.X_UNIT * 5, (int) (Game.Y_UNIT * (i + 1.5)), Game.X_UNIT * 3, Game.Y_UNIT);
				this.add(majorPane);
				
				JButton courseSelector = new JButton("Select " + course.toString());
				courseSelector.setBounds(Game.X_UNIT * 4, (int) (Game.Y_UNIT * (i + 1.7)), Game.X_UNIT, (int) (Game.Y_UNIT * 0.8));
				courseSelector.addActionListener(new ActionListener() {
				
					@Override
					public void actionPerformed(ActionEvent e) {
					
						game.getPlayer().getCurrentCourses().add(course);
						
						if (game.getPlayer().totalCredits() < 18) {
							game.changeScreen(new CourseSelection(game));
						} else {
							game.changeScreen(new Menu(game));
						}
						
					}
					
				});
				this.add(courseSelector);
				
			}
			
		}
		
	}
	
}
