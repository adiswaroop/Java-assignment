interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * this.r* this.r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.r;
    }
}

class Rectangle implements Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return this.length * this.breadth;
    }

    @Override
    public double perimeter() {
        return 2* (this.length + this.breadth);
    }
}

public class Prog1 {
    public static void main(String[] args) {
        Circle c = new Circle(23.0);
        System.out.println("Area of the circle: " + c.area());
        System.out.println("Perimeter of the circle: " + c.perimeter());

        Rectangle r = new Rectangle(10.0, 20.0);
        System.out.println("Area of the rectangle: " + r.area());
        System.out.println("Perimeter of the rectangle: " + r.perimeter());
    }
}