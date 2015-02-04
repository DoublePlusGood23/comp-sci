// Fig. 8.11: EmployeeTest.java
// Demonstrating an object with a member object.
import javax.swing.JOptionPane;

public class EmployeeTest {

    public static void main( String args[] )
    {
	System.out.println(Employee.getCount());

	Date bday1 = new Date(4,4,1976);
	Date bday2 = new Date(9,25,1998);

	Date hire1 = new Date(7,20,1999);
	Date hire2 = new Date(2,3,2015);

	Employee e1 = new Employee("Keith", "Enminger", bday1, hire1);
	Employee e2 = new Employee("Noah", "Young", bday2, hire2);

	System.out.println(e1.getCount());
	System.out.println(e2.getCount());

	e1 = null;
	System.out.println(e2.getCount());

	//Set aside memory for 10 employees
	// BUT THEY ARE NOT CONSTRUCTED YET! (null memory value!)
	Employee employee[] = new Employee[10];
	System.out.println(employee[0]);

	for(int x = 0; x < employee.length; x++)
	    {
		employee[x] = new Employee();
	    }

	System.out.println(employee[0].toEmployeeString());
	System.out.println(employee[9].getCount());
    }

} // end class EmployeeTest
