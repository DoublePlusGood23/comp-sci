// Fig. 10.20: InterfaceTest.java
// Test Point, Circle, Cylinder hierarchy with interface Shape.

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class InterfaceTest
{
   public static void main( String args[] )
   {
      // set floating-point number format
      DecimalFormat twoDigits = new DecimalFormat( "0.00" );

      // create Point, Circle and Cylinder objects
      Point point = new Point( 7, 11 );
      Circle circle = new Circle( 22, 8, 3.5 );
      Cylinder cylinder = new Cylinder( 20, 30, 3.3, 10.75 );

      // obtain name and string representation of each object
      String output = point.getName() + ": " + point + "\n" +
         circle.getName() + ": " + circle + "\n" +
         cylinder.getName() + ": " + cylinder + "\n";

      Shape arrayOfShapes[] = new Shape[ 3 ];  // create Shape array

      // aim arrayOfShapes[ 0 ] at subclass Point object
      arrayOfShapes[ 0 ] = point;

      // aim arrayOfShapes[ 1 ] at subclass Circle object
      arrayOfShapes[ 1 ] = circle;

      // aim arrayOfShapes[ 2 ] at subclass Cylinder object
      arrayOfShapes[ 2 ] = cylinder;

      // loop through arrayOfShapes to get name, string
      // representation, area and volume of every Shape in array
      for ( int i = 0; i < arrayOfShapes.length; i++ )
      {
         output += "\n\n" + arrayOfShapes[ i ].getName() + ": " +
            arrayOfShapes[ i ].toString() + "\nArea = " +
            twoDigits.format( arrayOfShapes[ i ].getArea() ) +
            "\nVolume = " +
            twoDigits.format( arrayOfShapes[ i ].getVolume() );
      }

      JOptionPane.showMessageDialog( null, output );  // display output

      System.exit( 0 );

   }

}
