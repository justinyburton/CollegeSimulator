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
    
    public final Event SLEEP = new Event(game, 1, sanity+20, parentalApproval-10, rest+50, hunger+20, GPA, studying, money, loans);
    public final Event STUDY = new Event(game, 1, sanity-20, parentalApproval+10, rest-20, hunger+30, GPA+.001, studying+1, money, loans);
    public final Event GO_TO_CLASS = new Event(game, 1, sanity-15, parentalApproval+10, rest-20, hunger+20, GPA+.001, studying, money, loans);
    public final Event EAT = new Event(game, 1, sanity+10, parentalApproval-5, rest-10, hunger-30, GPA, studying, money-10, loans);
    
    public Event(Game game, int hour, int sanity, int parentalApproval, int rest, int hunger, double GPA, int studying, int money, int loans) {
        
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
        game.getPlayer().setStudying(studying);
        game.getPlayer().changeMoney(money);
        game.getPlayer().changeLoans(loans);
    }
   
}
