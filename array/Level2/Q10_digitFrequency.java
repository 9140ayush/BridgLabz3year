package array.Level2;

import java.util.Scanner;

public class Q10_digitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        long num = sc.nextLong();

        String numStr = String.valueOf(num);
        int[] freq = new int[10];

        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            if (Character.isDigit(ch)) {
                freq[ch - '0']++;
            }
        }

        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " -> " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
