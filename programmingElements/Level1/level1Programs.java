import java.util.*;

public class level1Programs {

    // Q1: Harry's Age
    static void harryAge() {
        int birthYear = 2000, currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in " + currentYear + " is " + age);
    }

    // Q2: Sam’s Average
    static void samAverage() {
        int maths = 94, physics = 95, chemistry = 96;
        double avg = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + avg);
    }

    // Q3: Km to Miles (fixed 10.8)
    static void kmToMilesFixed() {
        double km = 10.8;
        double miles = km / 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }

    // Q4: Profit and Loss
    static void profitLoss() {
        int costPrice = 129, sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }

    // Q5: Pen Division
    static void penDivision() {
        int pens = 14, students = 3;
        int perStudent = pens / students;
        int remaining = pens % students;
        System.out.println("The Pen Per Student is " + perStudent +
                " and the remaining pen not distributed is " + remaining);
    }

    // Q6: Discount (fixed fee)
    static void discountFixed() {
        int fee = 125000, discountPercent = 10;
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }

    // Q7: Volume of Earth
    static void volumeEarth() {
        double radiusKm = 6378;
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double miles = radiusKm / 1.6;
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(miles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                " and cubic miles is " + volumeMiles3);
    }

    // Q8: Km to Miles (user input)
    static void kmToMilesInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double km = sc.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }

    // Q9: Discount (user input)
    static void discountInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter discount percent: ");
        double discountPercent = sc.nextDouble();
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }

    // Q10: Height conversion
    static void heightConversion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double cm = sc.nextDouble();
        double inches = cm / 2.54;
        double feet = inches / 12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + (int) feet +
                " and inches is " + (inches % 12));
    }

    // Q11: Calculator
    static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        System.out.println("Addition: " + (n1 + n2));
        System.out.println("Subtraction: " + (n1 - n2));
        System.out.println("Multiplication: " + (n1 * n2));
        System.out.println("Division: " + (n1 / n2));
    }

    // Q12: Triangle Area
    static void triangleArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of triangle is " + area + " sq units");
    }

    // Q13: Square Side
    static void squareSide() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }

    // Q14: Feet to Yard & Mile
    static void feetToYardMile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println(feet + " feet = " + yards + " yards = " + miles + " miles");
    }

    // Q15: Purchase Price
    static void totalPurchase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        double total = unitPrice * qty;
        System.out.println("The total purchase price is INR " + total +
                " if the quantity " + qty + " and unit price is INR " + unitPrice);
    }

    // Q16: Handshakes
    static void handshakes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("Maximum number of handshakes among " + n + " students is " + handshakes);
    }

    // Main method
    public static void main(String[] args) {
        // Run whichever program you want
        harryAge();
        samAverage();
        kmToMilesFixed();
        profitLoss();
        penDivision();
        discountFixed();
        volumeEarth();
        // For input-based programs, uncomment and run one by one:
        // kmToMilesInput();
        // discountInput();
        // heightConversion();
        // calculator();
        // triangleArea();
        // squareSide();
        // feetToYardMile();
        // totalPurchase();
        // handshakes();
    }
}
