import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Validate the input
        do {
            if (weight < 0) {
                System.out.print("Weight cannot be negative. Please enter a valid weight in kilograms: ");
                weight = scanner.nextDouble();
            }
        } while (weight < 0);

        // Prompt the user to enter height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Validate the input
        do {
            if (height < 0) {
                System.out.print("Height cannot be negative. Please enter a valid height in meters: ");
                height = scanner.nextDouble();
            }
        } while (height < 0);

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Interpret BMI
        String interpretation = interpretBMI(bmi);

        // Display the results
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Interpretation: " + interpretation);

        // Close the Scanner
        scanner.close();
    }

    // Function to calculate BMI
    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Function to interpret BMI
    private static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
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

/**
 * Example Usage 1:
 * Enter your weight in kilograms: 70
 * Enter your height in meters: 1.75
 * Your BMI is: 22.857142857142858
 * Interpretation: Normal weight
 */

/**
 * Example Usage 2:
 * Enter your weight in kilograms: 90
 * Enter your height in meters: 1.75
 * Your BMI is: 29.387755102040817
 * Interpretation: Overweight
 */

/**
 * Example Usage 3:
 * Enter your weight in kilograms: 100
 * Enter your height in meters: 1.75
 * Your BMI is: 32.6530612244898
 * Interpretation: Obese
 */
