package methods;

// Circle class with static methods
class Circle {
    public static void area(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area: " + area);
    }

    public static void circumference(double radius) {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference: " + circumference);
    }
}

// Main class
public class StaticMethod {
    public static void main(String[] args) {
        // Calling static methods from Circle
        Circle.area(3);
        Circle.circumference(4.5);

        Circle.area(5);
        Circle.circumference(5);
    }
}

// Another driver class
class CircleDriver {
    public static void main(String[] args) {
        Circle.area(2.6);
        Circle.circumference(2.6);
    }
}
