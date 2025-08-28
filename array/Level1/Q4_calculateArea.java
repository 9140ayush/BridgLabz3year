public class Q4_calculateArea {

    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("Area = " + areaCircle(5));
    }
}
