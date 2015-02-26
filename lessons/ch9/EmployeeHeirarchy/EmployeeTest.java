// EmployeeTest.java
// Employee hierarchy test program

import java.text.*;
import javax.swing.*;

public class EmployeeTest
{
    public static void main( String[] args )
    {
	DecimalFormat twoDigits = new DecimalFormat( "0.00" );

      	// create Employee array
      	Employee employees[] = new Employee[ 4 ];

      	// initialize array with Employees
      	employees[ 0 ] = new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 ); // done 
      	employees[ 1 ] = new CommissionEmployee( "Sue", "Jones", "222-22-2222", 10000, .06 ); // SALE, PERCENT - done
      	employees[ 2 ] = new BasePlusCommissionEmployee( "Bob", "Lewis", "333-33-3333", 5000, .04, 300 ); // EXTEND CommissionE, BASE - done 
      	employees[ 3 ] = new HourlyEmployee( "Karen", "Price", "444-44-4444", 16.75, 40 ); // done

      	String output = "";

      	// generically process each element in array employees
	for ( int i = 0; i < employees.length; i++ )
	    {
		output += employees[ i ].toString() + "\nEmployee " + i +
		    " is a " + employees[ i ].getClass().getName() + "\n";
	    }

	JOptionPane.showMessageDialog( null, output );
	System.exit( 0 );
    }
}
