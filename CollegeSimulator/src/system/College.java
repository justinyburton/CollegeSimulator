package system;

import acm.graphics.GImage;
import game.Game;

public class College extends GImage {
	
	private static final long serialVersionUID = -6358763747539732319L;
	
	//Field Variables
	private String name;
	private int prestige; //Reputation of school. [1-100]
	private int acceptanceRate; //Chance of acceptance. Changes for individuals.
	private int difficulty; //Difficulty of school. [1-100]
	private int tuition; //Price per year of school.
	private Major[] specialties;
	private String description;
	
	//College Descriptions
	private static final String SU_DESCRIPTION = "Everyone knows Springfield University. Nearly synonymous with high acheivement, " +
	"Springfield is sought after by nearly all college goers, and of course their parental figures. Many will sacrifice their " +
	"childhood just for the prestige of a degree from Springfield University. Because of its prestige, Springfield has the highest " +
	"tuition of any school available, and will require large loss of sanity due to the necessary high school work. Your parents, however, " +
	"will be pleased with this school. Choose wisely.";
	
	//List of Colleges
	public static final College SU = new College("Springfield University", 100, 70, new Major[] {Major.CS, Major.ENGL, Major.HIST, Major.MATH, Major.PHYS}, SU_DESCRIPTION, "SU.jpg");
	public static final College FIT = new College("Franklin Institute of Technology (FIT)", 98, 90, new Major[] {Major.CS, Major.ENGIN, Major.MATH, Major.PHYS}, "", "FIT.jpg");
	public static final College GC = new College("Greenville College", 80, 80, new Major[] {Major.ART, Major.ENGL, Major.HIST, Major.THEA, Major.SPAN}, "", "GC.jpg");
	public static final College AU = new College("Arlington University", 75, 70, new Major[] {Major.CS, Major.ENGIN, Major.HIST, Major.MATH, Major.THEA}, "", "AU.jpg");
	public static final College CC = new College("Clinton College", 60, 65, new Major[] {Major.ART, Major.ENGL, Major.HIST, Major.MATH, Major.SPAN}, "", "CC.jpg");
	public static final College FSU = new College("Fairview State University", 45, 40, new Major[] {Major.CS, Major.ENGIN, Major.MATH, Major.PHYS, Major.SPAN}, "", "FSU.jpg");
	
	public College(String name, int prestige, int difficulty, Major[] specialties, String description, String filePath) {
		super(filePath);
		this.name = name;
		this.prestige = prestige;
		this.acceptanceRate = 105 - prestige;
		this.difficulty = difficulty;
		this.tuition = prestige * 550 + 10000;
		this.specialties = specialties;
		this.description = description;
		this.setSize(Game.X_UNIT * 2, Game.Y_UNIT * 3);
	}
	
	public String toString() {
		return new String(name);
	}

	public int getPrestige() {
		return prestige;
	}

	public int getAcceptanceRate() {
		return acceptanceRate;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public int getTuition() {
		return tuition;
	}

	public Major[] getSpecialties() {
		return specialties.clone();
	}

	public String getDescription() {
		return description;
	}
	
	
	
}
