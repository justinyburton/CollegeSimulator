package system;

import java.util.ArrayList;

public class Player {
	
	private String name;
	private int sanity;
	private int parentalApproval;
	private int money;
	private int loans;
	private Avatar avatar;
	private College college;
	private Major major;
	private ArrayList<Course> completedCourses;
	private ArrayList<Course> currentCourses;
	
	public Player() {
		setSanity(50);
		setParentalApproval(50);
		setMoney(100000);
		setAvatar(new Avatar());
		setCompletedCourses(new ArrayList<Course>(Course.ALL_COURSES.length));
		setCurrentCourses(new ArrayList<Course>(Course.ALL_COURSES.length));
	}

	public void selectCollege(College college) {
		this.college = college;
		setSanity(120 - college.getPrestige());
		setParentalApproval(college.getPrestige() - 20);
		setMoney(getMoney() - college.getTuition() / 2);
	}
	
	public boolean hasCompleted(Course course) {
		return completedCourses.contains(course);
	}
	
	public boolean isTaking(Course course) {
		return currentCourses.contains(course);
	}
	
	public int totalCredits() {
		int sum = 0;
		for (int i = 0; i < currentCourses.size(); i++) {
			sum += currentCourses.get(i).getCredits();
		}
		return sum;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Course> getCompletedCourses() {
		return completedCourses;
	}

	public void setCompletedCourses(ArrayList<Course> completedCourses) {
		this.completedCourses = completedCourses;
	}

	public ArrayList<Course> getCurrentCourses() {
		return currentCourses;
	}

	public void setCurrentCourses(ArrayList<Course> currentCourses) {
		this.currentCourses = currentCourses;
	}
	
}
