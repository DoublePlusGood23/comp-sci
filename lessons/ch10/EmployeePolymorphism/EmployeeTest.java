// Employee Test class

public class EmployeeTest
{
    public static void main(String args[])
    {
	Employee e[] = new Employee[4];

	// 
	e[0] = new SalariedEmployee("John", "Doe", "111-11-1111", 1000);
	e[1] = new SalariedEmployee("Jane", "Doe", "222-22-2222", 1200);

	// HourlyEmployee IS an Employee.
	e[2] = new HourlyEmployee("Jack", "Doe", "333-33-3333", 10, 40);
	e[3] = new HourlyEmployee("Jim", "Doe", "444-44-4444", 12, 36);

	for(int x = 0; x < e.length; x++)
	    {
		System.out.println(e[x].toString());
		System.out.println(e[x].earnings());
	    }
    }
}
