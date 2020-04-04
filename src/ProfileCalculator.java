import javax.swing.JOptionPane;

public class ProfileCalculator {
	private double inactiveBMR; //BMR stands for Basal Metabolic Rate
	private double dailyEnergyExpenditure;

	
	/**
	 * Calculate user's BMI using Metrics measures
	 * @param currentWeight
	 * @param currentHeight
	 * @return
	 */
	private static double calculateBMI(double currentWeight, double currentHeight) {
		double BMI = (currentWeight * 700) / (currentHeight * currentHeight);
		return BMI;
	}
	
	/**
	 * Calculate user's inactiveBMR using Metrics measures
	 * @param gender
	 * @param currentWeight
	 * @param currentHeight
	 * @param age
	 * @return
	 */
	private double calculateInactiveBMR(String gender, double currentWeight, double currentHeight, int age) {
		if ( gender.toLowerCase().equals("male") || gender.toLowerCase().equals("m") ) {
			inactiveBMR = 66 + (6.23 * currentWeight) + (12.7 * currentHeight) - (6.8 * age);
		}
		else if (gender.toLowerCase().equals("female") || gender.toLowerCase().equals("f")){
			inactiveBMR = 655 + (4.35 * currentWeight) + (4.7 * currentHeight) - (4.7 * age);
		}
		else {
			JOptionPane.showMessageDialog(null, "You have entered an invalid choice. Please select \"male\" or \"female\"");
		}
		return inactiveBMR;

	}
	
	//Add in method to calculate Activity level
	/*
	public float calcTDEE(String activityLevel) {
		Map<String, float> activityLevelMultipliers = new Map<String, float>();
		activityLevelMultipliers.put("Sedentary", 1.2);
		activityLevelMultipliers.put("Lightly Active", 1.375);
	    return activityLevelMultipliers.get(activityLevel) * calcBMR(...);
	}
    public static int calcTDEE(String selectedActivityLevel) {
        return (int) Math.round(calcBMR(BmrMain.userAge, BmrMain.userHeight, BmrMain.userWeight) * BmrMain.activityMap.get(selectedActivityLevel));
}
*/
	/**
	 * Calculates the minimum number of calories to maintain current weight
	 * @param activityLevel
	 * @return
	 */
	public double calculateDailyEnergyExpenditure(int activityLevel) {
		
		if (activityLevel == 1) { //Sendary BMR (little or no exercise, desk job)
			dailyEnergyExpenditure = inactiveBMR * 1.2;
		}else if (activityLevel == 2) { //Lightly active BMR (light exercise/sports 1-3 days/wk)
			dailyEnergyExpenditure = inactiveBMR * 1.375;
		}else if (activityLevel == 3) { //Mod. active BMR (moderate exercise/sports 3-5 days/wk)
			dailyEnergyExpenditure = inactiveBMR * 1.55;
		}else if (activityLevel == 4) { //Very active BMR (hard exercise/sports 6-7 days/wk)
			dailyEnergyExpenditure = inactiveBMR * 1.725;
		}else if (activityLevel == 5) { //Extra active BMR (hard daily exercise/sports & physical job)
			dailyEnergyExpenditure = inactiveBMR * 1.9;
		}
		return dailyEnergyExpenditure;
	}
	
	//Figure out how to relate Daily Energy Expenditure to how much user intakes a day and what is his caloric deficit
	//Add in method to calculate how many more weeks left
	
	
}
