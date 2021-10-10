/**
 * Cempron, Trisha Ann E. 
 * Schedule: 5:30 - 8:30, TTH
 */
public class CempronTrishaDemo {
   public static void main(String[] args) {

      Shape shape1 = new Shape();
      Circle circle1 = new Circle(3.0, "blue", true);
      Rectangle rectangle1 = new Rectangle(6.0, 3.0);
      Square square1 = new Square(1.0, "orange", true);

      System.out.println("SHAPE:");
      System.out.println(shape1.toString());
      System.out.println("===========================================");
      System.out.println("CIRCLE: ");
      System.out.println(circle1.toString());
      System.out.println("Area: " + String.format("%.2f", circle1.getArea()));
      System.out.println("Perimeter: " + String.format("%.2f", circle1.getPerimeter()));
      System.out.println("===========================================");
      System.out.println("RECTANGLE:");
      System.out.println(rectangle1.toString());
      System.out.println("Area: " + String.format("%.2f", rectangle1.getArea()));
      System.out.println("Perimeter: " + String.format("%.2f", rectangle1.getPerimeter()));
      System.out.println("===========================================");
      System.out.println("SQUARE: ");
      System.out.println(square1.toString());
   }
}

class Shape {
   private String Color;
   private boolean fill;

   // constuctor
   public Shape() {
      Color = "red";
      fill = true;
   }

   // constuctor
   public Shape(String clr, boolean fill) {
      Color = clr;
      this.fill = fill;
   }

   public String getColor() {
      return Color;
   }

   public void setColor(String color) {
      Color = color;
   }

   public boolean isFilled() {
      return fill;
   }

   public void setFilled(boolean fill) {
      this.fill = fill;
   }

   public String toString() {
      return "Shape [color = " + getColor() + ", filled = " + isFilled() + "]";
   }
}

class Circle extends Shape {
   private double radius;

   public Circle() {
      radius = 1.0;
   }

   public Circle(double radius) {
      this.radius = radius;
   }

   public Circle(double radius, String color, boolean fill) {
      super(color, fill);
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double getArea() {
      return Math.PI * radius * radius;
   }

   public double getPerimeter() {
      return 2 * Math.PI * radius;
   }

   public String toString() {
      return "Circle[ " + super.toString() + ", radius = " + radius + "]";
   }
}

class Rectangle extends Shape {
   private double Width;
   private double Length;

   // constructor
   public Rectangle() {
      Width = 1.0;
      Length = 1.0;
   }

   // constructor
   public Rectangle(double width, double length) {
      Width = width;
      Length = length;
   }

   // constructor
   public Rectangle(double width, double length, String color, boolean fill) {
      super(color, fill);
      Width = width;
      Length = length;
   }

   public double getWidth() {
      return Width;
   }

   public void setWidth(double width) {
      Width = width;
   }

   public double getLength() {
      return Length;
   }

   public void setLength(double length) {
      Length = length;
   }

   public double getArea() {
      return Length * Width;
   }

   public double getPerimeter() {
      return 2 * (Length + Width);
   }

   public String toString() {
      return "Rectangle[ " + super.toString() + ", width = " + Width + ", length = " + Length + "]";
   }

}

class Square extends Rectangle {
   private double Side;

   // constructor
   public Square() {
      Side = 1.0;
      super.setWidth(Side);
      super.setLength(Side);
   }

   // constructor
   public Square(double side) {
      super(side, side);
      Side = side;

   }

   // constructor
   public Square(double side, String color, boolean fill) {
      super(side, side, color, fill);
      Side = side;
   }

   public double getSide() {
      return Side;
   }

   public void setSide(double side) {
      Side = side;
   }

   public void setWidth(double side) {
      super.setWidth(side);
   }

   public void setLength(double side) {
      super.setLength(side);
   }

   public String toString() {
      return "Square[ " + super.toString() + "]";
   }
}
