package CourseraModule3;

import java.util.Scanner;

public class UserInput {
    public String obtainBMISystem() {
        // Display the welcome message to the user
        System.out.println("Welcome to the BMI calculator app!");
        System.out.println("Please select the preferred BMI calculation system (Imperial/Metric):");

        // scanner that captures user input for the performance BMI system
        Scanner input = new Scanner(System.in);
        // Reading the line of user input from the Scanner in to a String variable
        String bmiSystem = input.next();

        // Checking if a valid BMI systems has been entered by the user
        if (!(bmiSystem.equalsIgnoreCase("Imperial") || bmiSystem.equalsIgnoreCase("Metric"))) {
            // If not, return an empty String from the method
            return "";

        }
        
        
        // Otherwise (if not invalid) return the user entered BMI system
        return bmiSystem;

    }

    // Obtain user input for the weight in Pounds or Kiloes, based on the entered
    // BMI system
    public double obtainWeight(String bmiSystem){
            //Variable to store the weight valies
            double weight= 0;
            // variable to indicate if the user input is valid or not
            boolean isValidInput = true;

            // The loop that controls obtaining user input for weoght util a vallid value is entered
            while (isValidInput) {
                //Scanner that captures user input for the wight value
                Scanner input = new Scanner(System.in);
                //a swithch statement that determines if wright should be obtaining in Pounds or Kilos based on the BMI system
                switch (bmiSystem.toUpperCase()) {
                    case "IMPERIAL":
                        // DISPLAY the message to obtain weight in Pounds
                        System.out.println("Enter weight in Pounds: ");
                        break;
                case "METRIC":
                // Display the message to obtain weight in Kilos
                System.out.println("Enter wright in Kilos: ");
                break;
                case "":
                // display the message to ask the user to enter a valid valuer
                System.out.println("Please Enter a valid BMI System as input");
                break;
                    default:
                        break;
                }

                // an if statement that check if the user entered a valid value 
                if (input.hasNextDouble()) {
                    // read the double value from the scanner object input 
                    weight = input.nextDouble();
                    // set that the user input in not invalid 
                    isValidInput = false;
                }else{
                    //display a message asking the user to iput valid value .. in case 
                    System.out.println("Please enter a value weight");
                    // set the weight to 0
                    weight = 0;
                    input.close();
                }
                
            }
            // return the weight
            return weight;
        }

    // Please implement the obtainHeight() method to obtains user input for
    // the height in Inches or Meters, based on the entered BMI system
    public double obtainHeight(String bmiSystem) {
        // variable to store the height value
        double height = 0;
        // variable indicate if the user input is valid or not
        boolean isValidInput = true;

        // loop that control obtaining user input for height until a valid value is
        // entered
        while (isValidInput) {
            Scanner input = new Scanner(System.in);
            // a swithch statement that determines if the height should be in Inches or
            // Meters based of the BMI system

            switch (bmiSystem.toUpperCase()) {
                case "IMPERIAL":
                    // dsiplay the message to obtain height in Inches
                    System.out.println("Enter height in Inches:");
                    break;
                case "METRIC":
                    // dsiplay the message to obtain height in Meters
                    System.out.println("Enter height in Meters:");
                    break;

            }
            // An if statement that checks if the user has entered a valid value (double
            // value) for height
            if (input.hasNextDouble()) {
                height = input.nextDouble();
                isValidInput = false;
            } else {
                System.out.println("Please enter a valid height");
                height = 0;
                input.close();
            }
            
        }
        return height;

    }
}
