package system;

public class Location {
	
	private String name;
	
	public static final Location DORM = new Location("Dorm");
	public static final Location LIBRARY = new Location("Library");
	public static final Location CLASSROOM = new Location("Classroom");
	public static final Location DINING_HALL = new Location("Dining Hall");
	
	public Location(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object o) {
		return (o instanceof Location) && o.toString().equals(name);
	}
	
}
