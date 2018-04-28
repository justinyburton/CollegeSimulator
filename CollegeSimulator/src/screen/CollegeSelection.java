package screen;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import acm.graphics.GLabel;
import game.Game;
import system.College;

public class CollegeSelection extends Screen {
	
	private static final long serialVersionUID = 7435310449856598566L;
	
	private GLabel titleLabel;
	private GLabel SULabel;
	private GLabel FITLabel;
	private GLabel GCLabel;
	private GLabel AULabel;
	private GLabel CCLabel;
	private GLabel FSULabel;
	
	private Font titleFont;
	private Font collegeFont;
	
	public CollegeSelection(Game game) {
		
		super(game);
		
		//This creates the two fonts.
		titleFont = new Font(Font.SERIF, Font.BOLD, 40);
		collegeFont = new Font(Font.SERIF, Font.BOLD, 25);
		
		//This creates the label at the top.
		titleLabel = new GLabel("Select Your College", Game.X_UNIT * 5, Game.Y_UNIT);
		titleLabel.setFont(titleFont);
		this.add(titleLabel);
		
		//Each college is created below.
		//SU
		SULabel = new GLabel(College.SU.toString(), Game.X_UNIT * 2, Game.Y_UNIT * 2.5);
		SULabel.setFont(collegeFont);
		this.add(SULabel);
		this.add(College.SU, Game.X_UNIT * 2, Game.Y_UNIT * 3);
		College.SU.addMouseListener(new CollegeClickListener(College.SU));
		
		//FIT
		FITLabel = new GLabel(College.FIT.toString(), Game.X_UNIT * 5, Game.Y_UNIT * 2.5);
		FITLabel.setFont(collegeFont);
		this.add(FITLabel);
		this.add(College.FIT, Game.X_UNIT * 5, Game.Y_UNIT * 3);
		College.FIT.addMouseListener(new CollegeClickListener(College.FIT));
		
		//GC
		GCLabel = new GLabel(College.GC.toString(), Game.X_UNIT * 8, Game.Y_UNIT * 2.5);
		GCLabel.setFont(collegeFont);
		this.add(GCLabel);
		this.add(College.GC, Game.X_UNIT * 8, Game.Y_UNIT * 3);
		College.GC.addMouseListener(new CollegeClickListener(College.GC));
		
		//AU
		AULabel = new GLabel(College.AU.toString(), Game.X_UNIT * 2, Game.Y_UNIT * 7.5);
		AULabel.setFont(collegeFont);
		this.add(AULabel);
		this.add(College.AU, Game.X_UNIT * 2, Game.Y_UNIT * 8);
		College.AU.addMouseListener(new CollegeClickListener(College.AU));
		
		//CC
		CCLabel = new GLabel(College.CC.toString(), Game.X_UNIT * 5, Game.Y_UNIT * 7.5);
		CCLabel.setFont(collegeFont);
		this.add(CCLabel);
		this.add(College.CC, Game.X_UNIT * 5, Game.Y_UNIT * 8);
		College.CC.addMouseListener(new CollegeClickListener(College.CC));
		
		//FSU
		FSULabel = new GLabel(College.FSU.toString(), Game.X_UNIT * 8, Game.Y_UNIT * 7.5);
		FSULabel.setFont(collegeFont);
		this.add(FSULabel);
		this.add(College.FSU, Game.X_UNIT * 8, Game.Y_UNIT * 8);
		College.FSU.addMouseListener(new CollegeClickListener(College.FSU));
		
	}
	
	public class CollegeClickListener implements MouseListener {
		
		College college;
		
		public CollegeClickListener(College college) {
			this.college = college;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			getGame().changeScreen(new CollegeProfile(getGame(), college));
			
		}
		
		//All methods below are unused.
		@Override
		public void mousePressed(MouseEvent e) {}

		@Override
		public void mouseReleased(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}
		
	}
	
}
