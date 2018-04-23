package system;

public class Course {
	
	private Department department;
	private int number; //Course number
	private int difficulty; //Difficulty of course [0-100]
	private int credits; //Total credits, [0-5]
	
	public Course(Department department, int number, int difficulty, int credits) {
		this.department = department;
		this.number = number;
		this.difficulty = difficulty;
		this.credits = credits;
	}

	public int getNumber() {
		return number;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public int getCredits() {
		return credits;
	}
	
	public String toString() {
		return department.name();
	}
	
}
