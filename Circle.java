public class Circle {
   
   private double radius;
   private String color;

   public Circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
   }


   public double getRadius() {
      return this.radius;
   }
   public String getColor() {
      return this.color;
   }
   public void setRadius(double radius) {
      this.radius = radius;
   }
   public void setColor(String color) {
      this.color = color;
   }

   public double getArea() {
      return radius * radius * Math.PI;
   }

   public double getPerimeter() {
      return 2 * radius * Math.PI;
   }
}