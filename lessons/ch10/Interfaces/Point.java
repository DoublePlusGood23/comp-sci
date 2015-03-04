// Point.java
// Point class declaration implements interface Shape.

public class Point implements Shape 
{
   private int x;  // x part of coordinate pair
   private int y;  // y part of coordinate pair

   // no-argument constructor; x and y default to 0
   public Point()
   {
      
   } 

   // constructor
   public Point( int xValue, int yValue )
   {
      x = xValue;  // no need for validation
      y = yValue;  // no need for validation
   } 
 
   // set x in coordinate pair
   public void setX( int xValue )
   {
      x = xValue;  // no need for validation
   } 

   // return x from coordinate pair
   public int getX()
   {
      return x;
   } 

   // set y in coordinate pair
   public void setY( int yValue )
   {
      y = yValue;  // no need for validation
   } 

   // return y from coordinate pair
   public int getY()
   {
      return y;
   } 

   // abstract method getArea from Shape
   public double getArea()
   {
      return 0.0;
   } 

   // abstract method getVolume from Shape
   public double getVolume()
   {
      return 0.0;
   } 

   // abstract method getName to return "Point"
   public String getName()
   {
      return "Point";
   } 

   // override toString to return String representation of Point
   public String toString()
   {
      return "[" + getX() + ", " + getY() + "]";
   } 

}
