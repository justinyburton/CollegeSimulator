package system;

import acm.graphics.GImage;

public class College extends GImage {
	
	//Field Variables
	private String name;
	private int prestige; //Reputation of school. [1-100]
	private int acceptanceRate; //Chance of acceptance. Changes for individuals.
	private int difficulty; //Difficulty of school. [1-100]
	private int tuition; //Price per year of school.
	private Major[] specialties;
	private String description;
	
	public College(String name, int prestige, int difficulty, Major[] specialties, String description, String filePath) {
		super(filePath);
		this.name = name;
		this.prestige = prestige;
		this.acceptanceRate = 105 - prestige;
		this.difficulty = difficulty;
		this.tuition = prestige * 550 + 10000;
		this.specialties = specialties;
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
		return new String(description);
	}
	
}
