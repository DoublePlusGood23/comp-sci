// Fig. 10.21: Cylinder.java
// Cylinder class inherits from Circle.

public class Cylinder extends Circle 
{
   private double height;  // Cylinder's height

   // no-argument constructor; height defaults to 0.0
   public Cylinder()
   {
     
   } 

   // constructor
   public Cylinder( int x, int y, double radius, double heightValue )
   {
      super( x, y, radius );  // call Circle constructor
      setHeight( heightValue );
   } 

   // set Cylinder's height
   public void setHeight( double heightValue )
   {
      height = ( heightValue < 0.0 ? 0.0 : heightValue );
   } 

   // get Cylinder's height
   public double getHeight()
   {
      return height;
   } 

   // override abstract method getArea to return Cylinder area
   public double getArea()
   {
      return 2 * super.getArea() + getCircumference() * getHeight();
   } 

   // override abstract method getVolume to return Cylinder volume
   public double getVolume()
   {
      return super.getArea() * getHeight();
   } 

   // override abstract method getName to return "Cylinder"
   public String getName()
   {
      return "Cylinder";
   } 

   // override toString to return String representation of Cylinder
   public String toString()
   {
      return super.toString() + "; Height = " + getHeight();
   } 
} 
