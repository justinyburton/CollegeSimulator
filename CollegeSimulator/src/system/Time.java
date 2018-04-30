package system;

/*
 * This class defines in-game time. This includes days, the day of the week, hours, and minutes.
 */
public class Time {
	
	private int days;
	private int hours;
	private int minutes;
	private int dayOfWeek; //0 through 6, 0 Monday -> 6 Sunday
	
	public void changeTime(int days, int hours, int minutes) {
		this.minutes = (this.minutes + minutes) % 60;
		int changeInHours = hours + minutes / 60;
		this.hours = (this.hours + changeInHours) % 24;
		int changeInDays = days + changeInHours / 24;
		this.days = this.days + changeInDays;
		this.dayOfWeek = (this.dayOfWeek + changeInDays) % 7;
	}
	
	public String toString() {
		String amOrPm = "am";
		if (hours > 11)
			amOrPm = "pm";
		String daysPart = "Day " + days;
		int newHours = hours == 0 ? 12 : hours;
		return daysPart + " " + newHours + ":" + ((minutes < 10) ? ("0" + minutes) : minutes) + " " + amOrPm;
	}
	
	public int getDays() {
		return days;
	}
	
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
}
