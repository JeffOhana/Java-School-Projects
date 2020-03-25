public class Cylinder extends Circle {
   
   private double height;
   
   public Cylinder(double height, double radius, String color) {
      super(radius, color);  
      this.height = height;
   }
   
   
   public double getHeight() {
      return this.height;
   }
   public void setHeight(double height) {
      this.height = height;
   }

   @Override
   public double getArea() {
      return 2*Math.PI*getRadius()*height + 2*super.getArea();
   }

   
   public double getVolume() {
      return super.getArea()*height;   
   }

   public static void main(String[] args) {
   
      Cylinder cylinder1 = new Cylinder(4.0, 2.0,"blue");
      System.out.println("Radius: " + cylinder1.getRadius()+ "  ** Height : " + cylinder1.getHeight()+ 
         "  ** Color : " + cylinder1.getColor()+ "  ** Surface area : " + cylinder1.getArea()+ 
         "  ** Volume : " + cylinder1.getVolume());
   }

   
}