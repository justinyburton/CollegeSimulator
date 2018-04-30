package system;

public class Location {
	
	private String name;
	private String eventText;
	
	public static final Location DORM = new Location("Dorm", "Sleep? Don't be silly. You're in college now!");
	public static final Location LIBRARY = new Location("Library", "Success is 1% aspiration, and 99% perspiration. Who said I needed to be successful?");
	public static final Location CLASSROOM = new Location("Classroom", "Everyone's favorite place!");
	public static final Location DINING_HALL = new Location("Dining Hall", "Food is for the weak. Besides, the Wi-Fi is terrible in here.");
	
	public Location(String name, String eventText) {
		this.name = name;
		this.eventText = eventText;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object o) {
		return (o instanceof Location) && o.toString().equals(name);
	}

	public String getEventText() {
		return eventText;
	}
	
}
