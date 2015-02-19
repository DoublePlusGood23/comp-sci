// Exercise 9.6 Solution: QuadrilateralTest.java
// driver for exercise 9.6
import javax.swing.*;

public class QuadrilateralTest {

   public static void main( String[] args )
   {
      // NOTE: All coordinates are assumed to form the proper shapes
      // A quadrilateral is a four-sided polygon
      Quadrilateral quadrilateral = new Quadrilateral( 
         1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4 );

      // A trapazoid is a quadrilateral having two and only two parallel 
      // sides
      Trapazoid trapazoid = new Trapazoid( 
         0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0 );
      
      // A parallelogram is a quadrilateral whose opposite sides are 
      // parallel
      Parallelogram parallelogram = new Parallelogram( 
         5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0 );

      // A rectangle is an equiangular parallelogram
      Rectangle rectangle = new Rectangle( 
         17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0 );

      // A square is an equiangular and equilateral parallelogram
      Square square = new Square( 
         4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0 );

      String result = quadrilateral.toString() + "\n" +
         trapazoid.toString() + "\n" + parallelogram.toString() + 
         "\n" + rectangle.toString() + "\n" + square.toString();

      JOptionPane.showMessageDialog( null, result );
      System.exit( 0 );

   } // end method main

} // end class QuadrilateralTest

/**************************************************************************
 * (C) Copyright 1992-2003 by Deitel & Associates, Inc. and Prentice      *
 * Hall. All Rights Reserved.                                             *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/