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
	"Springfield is sought after by nearly all college goers, and of course their parental figures. Nearly 30% of presidents were alumni " +
	"of this very school. Famous scientists from hundreds of years ago went to this school. Many will sacrifice their " +
	"childhood just for the prestige of a degree from Springfield University. Because of its prestige, Springfield has the highest " +
	"tuition of any school available, and will require large loss of sanity due to the necessary high school work. Your parents, however, " +
	"will be pleased with this school. Choose wisely.";
	
	private static final String FIT_DESCRIPTION = "Renowned for its rigorous curriculum and numerous scientist alumni, the Franklin " +
	"Institute of Technology provides unparalleled education in science, engineering, technology, and mathematics. Many are intimidated " +
	"by the sheer difficulty of the school, and the numerous hours each student dedicates to their classes each day. But those who " +
	"succeed are met with one of the most prestigious STEM degrees, and are often amongst the best earning college graduates. Let's hope " +
	"it can pay off the high price of tuition though. A large loss of sanity will be required dur to the necessary high school work, and " +
	"the difficulty of classes will lead to further difficulty, but your parents will be pleased with this school. Choose wisely.";
	
	private static final String GC_DESCRIPTION = "This small college is in a quiet, wealthy town called Greenville. Those who know " +
	"Greenville generally do not know it for the town, but for the prestigious school in its center. While famed for difficult " +
	"academics, great arts, and the numerous politicians it has graduated, it still struggles to recieve name recognition like its university " +
	"counterparts. Still, many choose Greenville College over famed universities like Springfield for its small environment and " +
	"personal connections with professors. But be warned, this close connection makes the courses much more difficult. The lower " +
	"name recognition due to its small size does not help with parental approval. Choose wisely.";
	
	private static final String AU_DESCRIPTION = "This moderately known university is a private university in the suburbs of a large " +
	"city. This school has a relatively mixed focus, with specialties in the humanities and STEM. For some, this is a sign of well " +
	"rounded graduates. For others, this is a sign of low specialization. The school is not particularly difficult, but it certainly " +
	"is not an easy school. It still carries a low acceptance rate, requiring high stress to go. Parents approval for Arlington is still " +
	"moderately high. Choose wisely.";
	
	private static final String CC_DESCRIPTION = "The town of Clinton is hardly a town; it is more a series of farms with a tiny " +
	"college in its center. The college is not very well known, but those who know it know it for its love for the outdoors and environment " +
	"of passion for learning. Many dislike its academic idealism, with its motto \"Learning for learning's sake.\" This hurts its overall " +
	"reputation, and perhaps your parents' approval. But those who go know that it gives more than its reputation for hippies and drugs " +
	"implies. It provides an environment for friendship and learning perhaps unparelleled at any other college. But will that pay the bills? " +
	"Choose wisely.";
	
	private static final String FSU_DESCRIPTION = "This is one of the largest universities in the world. Everybody knows it, but generally " +
	"not for academics. Maybe they heard about it while watching March Madness. Maybe they heard about it in a negative news article about a fraternity. " +
	"Those who go, however, know that Fairview State University still provides good academics, as long as you put in the work and find the " +
	"best majors. Your parents probably won't be happy with the school, but at least you're going to college. Luckily the school is not " +
	"very difficult, but it still requires hard work. Choose wisely.";
	
	//List of Colleges
	public static final College SU = new College("Springfield University", 100, 70, new Major[] {Major.CS, Major.ENGL, Major.HIST, Major.MATH, Major.PHYS}, SU_DESCRIPTION, "SU.jpg");
	public static final College FIT = new College("Franklin Institute of Technology (FIT)", 98, 90, new Major[] {Major.CS, Major.ENGIN, Major.MATH, Major.PHYS}, FIT_DESCRIPTION, "FIT.jpg");
	public static final College GC = new College("Greenville College", 80, 80, new Major[] {Major.ART, Major.ENGL, Major.HIST, Major.THEA, Major.SPAN}, GC_DESCRIPTION, "GC.jpg");
	public static final College AU = new College("Arlington University", 75, 70, new Major[] {Major.CS, Major.ENGIN, Major.HIST, Major.MATH, Major.THEA}, AU_DESCRIPTION, "AU.jpg");
	public static final College CC = new College("Clinton College", 60, 65, new Major[] {Major.ART, Major.ENGL, Major.HIST, Major.MATH, Major.SPAN}, CC_DESCRIPTION, "CC.jpg");
	public static final College FSU = new College("Fairview State University", 45, 40, new Major[] {Major.CS, Major.ENGIN, Major.MATH, Major.PHYS, Major.SPAN}, FSU_DESCRIPTION, "FSU.jpg");
	
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
