public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape() {
        this.filled = false;
        this.color = "BLUE";
    }

    Shape(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}


public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "Green";
        this.radius = 1;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return radius*radius*3.14;
    }

    @Override
    public double getPerimeter()
    {
        return radius*3.14;
    }

    @Override
    public String toString()
    {
        return null;
    }


}

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
        this.filled = false;
        this.color = "Black";
        width = 100;
        length = 50;
    }

    Rectangle(double width, double length) {
        this();
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        this(width, length);
        this.filled = filled;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}

public class Square extends Rectangle {

    Square() {
        this.filled = false;
        this.color = "BLUE";
        this.width = 100;
        this.length = 100;
    }

    Square(double side) {
        this();
        this.width = side;
        this.length = side;
    }

    Square(double side, String color, boolean filled) {
        this(side);
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {

        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double width) {

        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square:side,color: " + this.length + ", color: " + this.color;
    }
}

public class Test {
    public static void main(String[] arg) {
        Shape s1 = new Circle(5.5, "Red", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());

        System.out.println(" -------------------------------");

        Circle c1=(Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        System.out.println(" -------------------------------");

        Shape s2=new Rectangle(4,10,"Blue",false);
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getColor());
        System.out.println(((Rectangle) s2).getLength());

        System.out.println(" -------------------------------");

        Rectangle r1=(Rectangle)s2;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        System.out.println(" -------------------------------");

        Shape s3 = new Square(50);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getColor());
        System.out.println(((Square) s3).getSide());

        System.out.println(" -------------------------------");

    }
}
