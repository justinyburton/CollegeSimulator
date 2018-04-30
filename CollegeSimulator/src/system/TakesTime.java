package system;

//Interface for any class or event which takes time, or adds time to the current time.
public interface TakesTime {
	
	void takeTime(int days, int hours, int minutes);
	
}
