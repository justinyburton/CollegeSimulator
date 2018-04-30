package screen;

import game.Game;
import system.Avatar;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JEditorPane;

import acm.graphics.GLabel;

public abstract class GamePlay extends Screen {

    private static final long serialVersionUID = 1289597472127617015L;
	Avatar avatar;
    private GLabel name;
    private GLabel college;
    private GLabel major;
    private GLabel sanity;
    private GLabel parentalApproval;
    private GLabel rest;
    private GLabel hunger;
    private GLabel money;
    private GLabel loans;
    private GLabel currentTime;
    private GLabel currentLocation;
    
    private Font eventFont;
    private JEditorPane event;
    
    public GamePlay(Game game) {
        super(game);
        
        this.avatar = game.getPlayer().getAvatar();
        this.add(avatar, 2*Game.X_UNIT, 7*Game.Y_UNIT);
        
        //Attributes
        name = new GLabel("Name: " + game.getPlayer().getName());
        name.setFont("Serif-PLAIN-18");
        this.add(name, 2*Game.X_UNIT, Game.Y_UNIT);
        
        college = new GLabel("College: " + game.getPlayer().getCollege());
        college.setFont("Serif-PLAIN-18");
        this.add(college, 2*Game.X_UNIT, 1.5*Game.Y_UNIT);
        
        major = new GLabel("Major: " + game.getPlayer().getMajor());
        major.setFont("Serif-PLAIN-18");
        this.add(major, 2*Game.X_UNIT, 2*Game.Y_UNIT);
        
        sanity = new GLabel("Sanity: " + game.getPlayer().getSanity());
        sanity.setFont("Serif-PLAIN-18");
        this.add(sanity, 2*Game.X_UNIT, 2.5*Game.Y_UNIT);
        
        parentalApproval = new GLabel("Parental Approval: " + game.getPlayer().getParentalApproval());
        parentalApproval.setFont("Serif-PLAIN-18");
        this.add(parentalApproval, 2*Game.X_UNIT, 3*Game.Y_UNIT);
        
         rest = new GLabel("Rest: " + game.getPlayer().getRest());
         rest.setFont("Serif-PLAIN-18");
         this.add(rest, 2*Game.X_UNIT, 3.5*Game.Y_UNIT);
         
         hunger = new GLabel("Hunger: " + game.getPlayer().getHunger());
         hunger.setFont("Serif-PLAIN-18");
         this.add(hunger, 2*Game.X_UNIT, 4*Game.Y_UNIT);
        
        money = new GLabel("Money: " + game.getPlayer().getMoney());
        money.setFont("Serif-PLAIN-18");
        this.add(money, 2*Game.X_UNIT, 4.5*Game.Y_UNIT);
        
        loans = new GLabel("Loans: " + game.getPlayer().getLoans());
        loans.setFont("Serif-PLAIN-18");
        this.add(loans, 2*Game.X_UNIT, 5*Game.Y_UNIT);
        
        currentTime = new GLabel("Time: " + game.getTime().toString());
        currentTime.setFont("Serif-PLAIN-18");
        this.add(currentTime, 2*Game.X_UNIT, 5.5*Game.Y_UNIT);
        
        currentLocation = new GLabel("Current Location: " + game.getPlayer().getCurrentLocation());
        currentLocation.setFont("Serif-BOLD-20");
        this.add(currentLocation, 2 * Game.X_UNIT, 10 * Game.Y_UNIT);
        
        //Event Font
        eventFont = new Font(Font.SERIF, Font.PLAIN, 20);
        
        //Event
        event = new JEditorPane();
        event.setText(eventText());
        event.setFont(eventFont);
		event.setEditable(false);
		event.setBackground(Game.BACKGROUND_COLOR);
    	event.setBounds(Game.X_UNIT * 4, Game.Y_UNIT * 1, Game.X_UNIT * 7, Game.Y_UNIT * 4);
    	this.add(event);
    	
        //Options
        JButton[] optionsArray = options();
        for (int i = 0; i < optionsArray.length; i++) {
        	optionsArray[i].setSize((int)(Game.X_UNIT * 0.7), (int)(Game.Y_UNIT * 0.7));
        	this.add(optionsArray[i], (i + 4) * Game.X_UNIT, Game.Y_UNIT * 7);
        }
        
    }
    
    //Abstract methods
    public abstract String eventText();
    public abstract JButton[] options();
    
}
