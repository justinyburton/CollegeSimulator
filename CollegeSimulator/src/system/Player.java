package system;

public class Player {
	
	private int sanity;
	private int parentalApproval;
	private int money;
	private int loans;
	private Avatar avatar;
	private College college;
	private Major major;
	
	public Player() {
		setSanity(50);
		setParentalApproval(50);
		setMoney(100000);
		setAvatar(new Avatar());
	}

	public void selectCollege(College college) {
		this.college = college;
		setSanity(120 - college.getPrestige());
		setParentalApproval(college.getPrestige() - 20);
		setMoney(getMoney() - college.getTuition() / 2);
	}

	public int getSanity() {
		return sanity;
	}

	public void setSanity(int sanity) {
		this.sanity = sanity;
	}

	public int getParentalApproval() {
		return parentalApproval;
	}

	public void setParentalApproval(int parentalApproval) {
		this.parentalApproval = parentalApproval;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getLoans() {
		return loans;
	}

	public void setLoans(int loans) {
		this.loans = loans;
	}

	public Avatar getAvatar() {
		return avatar;
	}

	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}

	public College getCollege() {
		return college;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}
	
}
