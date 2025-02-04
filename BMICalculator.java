package CourseraModule3;

// BMICalculator class is a utility class that's used to calculate
// the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // Please declare 4 attributes/properties to represent weight in pounds,
    // height in inches, weight in kilos and height in meters
    double weightImperialInPounds;
    double heightImperialInInches;
    double weightMetricInKilos;
    double heightMetricInMeters;

    // Please use this default no arguments constructor to initialize
    // the 4 properties to some initial values
    public BMICalculator() {
        this.weightImperialInPounds = 1.0;
        this.heightImperialInInches = 1.0;
        this.weightMetricInKilos = 1.0;
        this.heightMetricInMeters = 1.0;
    }

    // Please implement the calculateBmiImperial() method to
    // take in weight and height to calculate and return the BMI value in the
    // Imperial system
    public double calculateBmiImperial(double weight, double height) {

        return  (703 * weightImperialInPounds) / heightImperialInInches;
        
    }

    // Please implement the calculateBmiMetric() method to take in weight
    // and height to calculate and return the BMI value in the Metric system
    public double calculateBmiMetric(double weightMetricInKilos, double heightMetricInMeters) {
        return weightMetricInKilos / (heightMetricInMeters * heightMetricInMeters);
        
    }

    // Please implement the getBMICategory() method so that it takes the BMI
    // value and returns the BMI category based on it
    public String getBMICategory(double bmi) {
        if (bmi < 18) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }

    }
}
