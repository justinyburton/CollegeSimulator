package system;

public class Major {
	
	private String name;
	private int difficulty;
	private int credits;
	private Course[] requiredCourses;
	
	public Major(String name, Course[] requiredCourses) {
		this.name = name;
		this.requiredCourses = requiredCourses;
		this.credits = sumCredits(requiredCourses);
		this.difficulty = avgDiff(requiredCourses);
	}
	
	private int sumCredits(Course[] courses) {
		int sum = 0;
		for (int i = 0; i < courses.length; i++)
			sum += courses[i].getCredits();
		return sum;
	}

	private int avgDiff(Course[] courses) {
		int sum = 0;
		for (int i = 0; i < courses.length; i++) {
			sum += courses[i].getDifficulty() * courses[i].getCredits();
		}
		return sum / this.credits;
	}

	public String toString() {
		return name;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public Course[] getRequiredCourses() {
		return requiredCourses;
	}
	
}
