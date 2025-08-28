public class Q1_canVote {

    public static boolean canVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        int age = 20;
        if (canVote(age)) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
