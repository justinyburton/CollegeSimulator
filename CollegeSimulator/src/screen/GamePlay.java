package screen;

import game.Game;
import system.Avatar;
import system.Player;
import acm.graphics.GLabel;

public class GamePlay extends Screen {

    Avatar avatar;
    private GLabel name;
    private GLabel college;
    private GLabel major;
    private GLabel sanity;
    private GLabel parentalApproval;
    private GLabel money;
    private GLabel loans;
    
    
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
        
        money = new GLabel("Money: " + game.getPlayer().getMoney());
        money.setFont("Serif-PLAIN-18");
        this.add(money, 2*Game.X_UNIT, 3.5*Game.Y_UNIT);
        
        loans = new GLabel("Loans: " + game.getPlayer().getLoans());
        loans.setFont("Serif-PLAIN-18");
        this.add(loans, 2*Game.X_UNIT, 4*Game.Y_UNIT);
        
        //Event
        
        
        //Options
        
    }

    
}
