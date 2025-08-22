import java.util.Scanner;

public class SelfProblems {

    // 1. Simple Interest
    public static void simpleInterest(Scanner sc) {
        System.out.println("\n1. Simple Interest");
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }

    // 2. Perimeter of Rectangle
    public static void perimeterOfRectangle(Scanner sc) {
        System.out.println("\n2. Perimeter of Rectangle");
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    // 3. Power Calculation
    public static void powerCalculation(Scanner sc) {
        System.out.println("\n3. Power Calculation");
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to " + exponent + " = " + result);
    }

    // 4. Average of Three Numbers
    public static void averageOfThree(Scanner sc) {
        System.out.println("\n4. Average of Three Numbers");
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = sc.nextDouble();
        double avg = (n1 + n2 + n3) / 3;
        System.out.println("Average = " + avg);
    }

    // 5. Kilometers to Miles
    public static void kmToMiles(Scanner sc) {
        System.out.println("\n5. Kilometers to Miles");
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Distance in miles = " + miles);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        simpleInterest(sc);
        perimeterOfRectangle(sc);
        powerCalculation(sc);
        averageOfThree(sc);
        kmToMiles(sc);

        sc.close();
    }
}
