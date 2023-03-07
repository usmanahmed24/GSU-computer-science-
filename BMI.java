import java.util.Scanner;
public class BMI {
    public static boolean isNumber(String z) {         //makes sure inputted value for height and weight is a number
        for (int i = 0; i < z.length(); i++) {
            if (!Character.isDigit(z.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static double BMI(double height, double weight) {          
        return weight / (height * height) * 703;                  //Formula for BMI is lbs/inches^2 -> multiply by 703 to get kgs/m^2
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = in.next();
        System.out.println("Please enter you PID#: ");
        String PID = in.next();
        System.out.println("Please enter your height");
        String height = in.nextLine();
        while (true) {
            if (isNumber(height)) {
                System.out.println("The height is:" + height);
                break;
            } else {
                System.out.println("Enter again");
                height = in.nextLine();
            }
        }
            System.out.println("Please enter your weight");
        String weight = in.nextLine();
        while (true) {
            if (isNumber(weight)) {
                System.out.println("The weight is:" + weight);
                break;
                } else {
                System.out.println("Enter again");
                weight = in.nextLine();
                }
            }
        double h = Double.parseDouble(height);
        double w = Double.parseDouble(weight);
        double bmi = BMI(h, w);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        if (bmi >= 18.5 && bmi <=24.9){
            System.out.println("normal");
        }
        if (bmi >= 25.0 && bmi <= 29.9){
            System.out.println("overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
