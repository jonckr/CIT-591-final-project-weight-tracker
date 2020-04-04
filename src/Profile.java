/**
 * This class saves the profile of the current user
 * @author jonckr
 *
 */
public class Profile {
	private String name;
	private String gender;
	private int age;
	private double startWeight; //Weight in Pounds
	// May have to account for it as an array later
	private double currentWeight; //Weight in Pounds
	private double currentHeight; //Weight in Pounds
	private double targetWeight; //Height in Inches
	private int activityLevel;
	private int intensity;

	//Constructor
	public Profile(String name, String gender, int age, double startWeight, double currentWeight, double currentHeight,
			double targetWeight, int activityLevel, int intensity) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.startWeight = startWeight;
		this.currentWeight = currentWeight;
		this.currentHeight = currentHeight;
		this.targetWeight = targetWeight;
		this.activityLevel = activityLevel;
		this.intensity = intensity;
	}


	public String getName() {
		return name;
	}
	

	public String getGender() {
		return gender;
	}



	public int getAge() {
		return age;
	}


	public double getStartWeight() {
		return startWeight;
	}


	public double getCurrentWeight() {
		return currentWeight;
	}


	public double getCurrentHeight() {
		return currentHeight;
	}


	public double getTargetWeight() {
		return targetWeight;
	}


	public int getActivityLevel() {
		return activityLevel;
	}


	public int getIntensity() {
		return intensity;
	}

	

}
