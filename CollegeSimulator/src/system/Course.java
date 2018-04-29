package system;

public class Course {
	
	private String department;
	private int number; //Course number
	private int difficulty; //Difficulty of course [0-100]
	private int credits; //Total credits, [0-5]
	
	//Course List
	public static final Course ART1 = new Course("ART", 101, 30, 3);
	public static final Course ART2 = new Course("ART", 102, 40, 3);
	public static final Course CS1 = new Course("CS", 111, 55, 3);
	public static final Course CS2 = new Course("CS", 112, 60, 3);
	public static final Course ENGIN1 = new Course("ENGIN", 101, 75, 4);
	public static final Course ENGIN2 = new Course("ENGIN", 102, 75, 4);
	public static final Course ENGL1 = new Course("ENGL", 101, 50, 3);
	public static final Course ENGL2 = new Course("ENGL", 102, 55, 3);
	public static final Course HIST1 = new Course("HIST", 101, 50, 3);
	public static final Course HIST2 = new Course("HIST", 225, 55, 3);
	public static final Course MATH1 = new Course("MATH", 111, 65, 3);
	public static final Course MATH2 = new Course("MATH", 112, 70, 3);
	public static final Course PHYS1 = new Course("PHYS", 111, 65, 4);
	public static final Course PHYS2 = new Course("PHYS", 112, 75, 4);
	public static final Course THEA1 = new Course("THEA", 101, 50, 3);
	public static final Course THEA2 = new Course("THEA", 102, 50, 3);
	public static final Course SPAN1 = new Course("SPAN", 101, 65, 4);
	public static final Course SPAN2 = new Course("SPAN", 102, 75, 4);
	
	public Course(String department, int number, int difficulty, int credits) {
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
		return this.department + " " + this.number;
	}
	
}
