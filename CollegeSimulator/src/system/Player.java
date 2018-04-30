package system;

import java.util.ArrayList;

public class Player {
	
	private String name;
	private int sanity;
	private int rest;
	private int parentalApproval;
	private int money;
	private int loans;
	private int hunger;
	private double GPA;
	private int studying;
	private Avatar avatar;
	private College college;
	private Major major;
	private ArrayList<Course> completedCourses;
	private ArrayList<Course> currentCourses;
	private Location currentLocation;
	
	public Player() {
		this.sanity = 50;
		this.parentalApproval = 50;
		this.money = 100000;
		this.loans = 100000;
		this.rest = 100;
		this.hunger = 0;
		this.currentLocation = Location.DORM;
		this.GPA = 4.0;
		
		setAvatar(new Avatar());
		setCompletedCourses(new ArrayList<Course>(Course.ALL_COURSES.length));
		setCurrentCourses(new ArrayList<Course>(Course.ALL_COURSES.length));
	}

	public void selectCollege(College college) {
		this.college = college;
		changeSanity(70 - college.getPrestige());
		changeParentalApproval(college.getPrestige() - 70);
		changeMoney(-college.getTuition() / 2);
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
	
	public boolean lost() {
		return sanity < 1 || rest < 1 || parentalApproval < 1 || money < 1 || loans > 300000 || hunger > 100 || GPA < 2.0;
	}
	
	public int getSanity() {
		return sanity;
	}

	public void changeSanity(int sanity) {
		this.sanity += sanity;
	}

	public int getParentalApproval() {
		return parentalApproval;
	}

	public void changeParentalApproval(int parentalApproval) {
		this.parentalApproval += parentalApproval;
	}

	public int getMoney() {
		return money;
	}

	public void changeMoney(int money) {
		this.money += money;
	}

	public int getLoans() {
		return loans;
	}

	public void changeLoans(int loans) {
		this.loans += loans;
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

	public int getRest() {
		return rest;
	}

	public void changeRest(int rest) {
		this.rest += rest;
	}

	public int getHunger() {
		return hunger;
	}

	public void changeHunger(int hunger) {
		this.hunger += hunger;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public double getGPA() {
		return GPA;
	}

	public void changeGPA(double GPA) {
		this.GPA = GPA;
	}

	public int getStudying() {
		return studying;
	}

	public void setStudying(int studying) {
		this.studying = studying;
	}
	
	public void changeStudying() {
		
	}
	
}
