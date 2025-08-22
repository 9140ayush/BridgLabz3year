import java.util.Scanner;

public class AssistedProblems {

    // 1. Welcome to Bridgelabz
    public static void welcomeMessage() {
        System.out.println("\n1. Welcome to Bridgelabz!");
        System.out.println("Welcome to Bridgelabz!");
    }

    // 2. Add Two Numbers
    public static void addTwoNumbers(Scanner sc) {
        System.out.println("\n2. Add Two Numbers");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum = " + (num1 + num2));
    }

    // 3. Celsius to Fahrenheit
    public static void celsiusToFahrenheit(Scanner sc) {
        System.out.println("\n3. Celsius to Fahrenheit");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }

    // 4. Area of Circle
    public static void areaOfCircle(Scanner sc) {
        System.out.println("\n4. Area of Circle");
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    // 5. Volume of Cylinder
    public static void volumeOfCylinder(Scanner sc) {
        System.out.println("\n5. Volume of Cylinder");
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder = " + volume);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        welcomeMessage();
        addTwoNumbers(sc);
        celsiusToFahrenheit(sc);
        areaOfCircle(sc);
        volumeOfCylinder(sc);

        sc.close();
    }
}
