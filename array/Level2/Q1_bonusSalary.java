package array.Level2;

import java.util.Scanner;

public class Q1_bonusSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input, try again!");
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;

            if (y > 5) {
                bonus[i] = 0.05 * s;
            } else {
                bonus[i] = 0.02 * s;
            }
            newSalary[i] = s + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += s;
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}
