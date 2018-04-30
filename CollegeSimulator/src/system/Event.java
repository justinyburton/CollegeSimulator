package system;

public class Event implements TakesTime {

    private int sanity;
    private int parentalApproval;
    private int rest;
    private int hunger;
    private int money;
    private int loans;
    
    public final Event SLEEP = new Event(sanity+20, parentalApproval-10, rest+50, hunger+20, money, loans);
    public final Event STUDY = new Event(sanity-20, parentalApproval+10, rest-20, hunger+30, money, loans);
    public final Event GO_TO_CLASS = new Event(sanity-15, parentalApproval+10, rest-20, hunger+20, money, loans);
    public final Event EAT = new Event(sanity+10, parentalApproval-5, rest-10, hunger-30, money-10, loans);
    
    public Event(int sanity, int parentalApproval, int rest, int hunger, int money, int loans) {
        
        this.sanity = sanity;
        this.parentalApproval = parentalApproval;
        this.rest = rest;
        this.hunger = hunger;
        this.money = money;
        this.loans = loans;
        
    }

    @Override
    public void takeTime(int days, int hours, int minutes) {
        // TODO Auto-generated method stub
        
    }
   
}
