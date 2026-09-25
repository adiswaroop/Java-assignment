interface MathConstants {
    double PI = 3.14159;
    double E = 2.71828;
}

class CircleConstants implements  MathConstants {
    double circumference(double radius) {
        return 2*PI*radius;
    }
}

public class Prog2 {
    public static void main(String[] args) {
        CircleConstants c = new CircleConstants();
        System.out.println("Circumference of the circle: " + c.circumference(20.0));

        // Access the interface constants by directly 
        System.out.println("Value of PI: " + MathConstants.PI);
        System.out.println("Value of E: " + MathConstants.E);

        // Access via the implemented class 
        System.out.println("Value of PI: " + CircleConstants.PI);
    }
}