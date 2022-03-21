import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab2 {
    static final double MIN_BMI_NORMAL = 18.5;
    static final double MAX_BMI_NORMAL = 24.9;
    static final double MAX_BMI_OVERWEIGHT = 29.9;

    public static void main(String[] args) {
        System.out.print("Please enter your height (m): ");
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        System.out.print("Please enter your weight (kg): ");
        double weight = scanner.nextDouble();
        giveAdviceYourBody(height, weight);
        System.out.print("Please enter the integer number to check odd or not: ");
        int numberToCheck = scanner.nextInt();
        System.out.println(oddOrNot(numberToCheck));
    }

    public static void giveAdviceYourBody(double height, double weight) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        double bmiIndex = Double.parseDouble(decimalFormat.format(weight / (height * height)));
        if (MIN_BMI_NORMAL <= bmiIndex && bmiIndex <= MAX_BMI_NORMAL) {
            System.out.println("====> Normal weight!!!\n====> Your body is so beautiful");
            return;
        }
        double minChangeWeight = Math.abs((bmiIndex - MIN_BMI_NORMAL)) * (height * height);
        double maxChangeWeight = Math.abs((bmiIndex - MAX_BMI_NORMAL)) * (height * height);
        if (bmiIndex < MIN_BMI_NORMAL) {
            System.out.printf("====> Underweight!!!!\n====> You should increase %.1f kg to %.1f kg to have normal weight\n", minChangeWeight, maxChangeWeight);
            return;
        } else if (bmiIndex <= MAX_BMI_OVERWEIGHT) {
            System.out.println("====> Overweight!!!");
        } else {
            System.out.println("====> Obesity!!!");
        }
        System.out.printf("====> You should decrease %.1f kg to %.1f kg to have normal weight\n", maxChangeWeight, minChangeWeight);
    }

    public static String oddOrNot(int number) {
        return (number % 2) != 0 ? "This is odd number" : "This is even number";
    }
}
