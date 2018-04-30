package system;

import game.Game;

public class Event implements TakesTime {

    private int sanity;
    private int parentalApproval;
    private int rest;
    private int hunger;
    private double GPA;
    private int studying;
    private int money;
    private int loans;
    private Game game;
    
    
    public Event(Game game, int hour, int sanity, int parentalApproval, int rest, int hunger, double GPA, int studying, int money, int loans) {
        
    	this.game = game;
        takeTime(0, hour, 0);
        this.sanity = sanity;
        this.parentalApproval = parentalApproval;
        this.rest = rest;
        this.hunger = hunger;
        this.GPA = GPA;
        this.studying = studying;
        this.money = money;
        this.loans = loans;
        
    }

    @Override
    public void takeTime(int days, int hours, int minutes) {
        game.getTime().changeTime(days, hours, minutes);
    }
    
    public void doAction() {
        game.getPlayer().changeSanity(sanity);
        game.getPlayer().changeParentalApproval(parentalApproval);
        game.getPlayer().changeRest(rest);
        game.getPlayer().changeHunger(hunger);
        game.getPlayer().changeGPA(GPA);
        game.getPlayer().changeStudying(studying);
        game.getPlayer().changeMoney(money);
        game.getPlayer().changeLoans(loans);
    }
   
}
