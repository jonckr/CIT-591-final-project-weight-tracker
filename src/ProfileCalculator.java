import javax.swing.JOptionPane;

public class ProfileCalculator {
	private double inactiveBMR; //BMR stands for Basal Metabolic Rate
	
	/**
	 * Calculate user's BMI using Metrics measures
	 * @param currentWeight
	 * @param currentHeight
	 * @return
	 */
	public double calculateBMI(double currentWeight, double currentHeight) {
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
	public double calculateInactiveBMR(String gender, double currentWeight, double currentHeight, int age) {
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
	
	//Add in method to calculate how many more weeks left
	
	
}
