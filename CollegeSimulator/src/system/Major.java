package system;

public class Major {
	
	private String name;
	private int difficulty; //Difficulty rating (1-100)
	private int credits; //Total credits
	private Course[] requiredCourses; //Array of required courses
	
	//List of Majors
	public static final Major ART = new Major("Art", new Course[] {Course.ART1, Course.ART2});
	public static final Major CS = new Major("Computer Science", new Course[] {Course.CS1, Course.CS2});
	public static final Major ENGIN = new Major("Engineering", new Course[] {Course.ENGIN1, Course.ENGIN2});
	public static final Major ENGL = new Major("English", new Course[] {Course.ENGL1, Course.ENGL2});
	public static final Major HIST = new Major("History", new Course[] {Course.HIST1, Course.HIST2});
	public static final Major MATH = new Major("Math", new Course[] {Course.MATH1, Course.MATH2});
	public static final Major PHYS = new Major("Physics", new Course[] {Course.PHYS1, Course.PHYS2});
	public static final Major THEA = new Major("Theater", new Course[] {Course.THEA1, Course.THEA2});
	public static final Major SPAN = new Major("Spanish", new Course[] {Course.SPAN1, Course.SPAN2});
	
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
