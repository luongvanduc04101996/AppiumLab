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
        GiveAdviceYourBody(height, weight);
        System.out.print("Please enter the integer number to check odd or not: ");
        int numberToCheck = scanner.nextInt();
        System.out.println(OddOrNot(numberToCheck));
    }

    public static void GiveAdviceYourBody(double height, double weight) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        double bmiIndex = Double.parseDouble(decimalFormat.format(weight / (height * height)));
        if (bmiIndex < MIN_BMI_NORMAL) {
            double minIncreWeight = (MIN_BMI_NORMAL - bmiIndex) * (height * height);
            double maxIncreWeight = (MAX_BMI_NORMAL - bmiIndex) * (height * height);
            System.out.printf("====> Underweight!!!!\n====> You should increase %.1f kg to %.1f kg to have normal weight\n", minIncreWeight, maxIncreWeight);
        } else if (bmiIndex <= MAX_BMI_NORMAL){
            System.out.println("====> Normal weight!!!\n====> Your body is so beautiful");
        } else if (bmiIndex > MAX_BMI_NORMAL) {
            double maxDecreWeight = (bmiIndex - MIN_BMI_NORMAL) * (height * height);
            double minDecreWeight = (bmiIndex - MAX_BMI_NORMAL) * (height * height);
            if (bmiIndex <= MAX_BMI_OVERWEIGHT) {
                System.out.println("====> Overweight!!!");
            } else {
                System.out.println("====> Obesity!!!");
            }
            System.out.printf("====> You should decrease %.1f kg to %.1f kg to have normal weight\n", minDecreWeight, maxDecreWeight);
        }
    }

    public static String OddOrNot(int number){
        if ((number % 2) == 0) {
            return "This is even number";
        }
        return "This is odd number";
    }
}
