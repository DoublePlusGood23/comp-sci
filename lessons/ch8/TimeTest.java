public class TimeTest
{
    public static void main(String args[])
    {
	Time3 t1 = new Time3();   // default constructor
	Time3 t2 = new Time3(10); // 10:0:0
	Time3 t3 = new Time3(10,48); // 10:48:0
	Time3 t4 = new Time3(10,49,11); // 10:49:11
	Time3 t5 = new Time3(9999,9999,9999); // 0:0:0

	Time3 oldTime = new Time3(t4); // Sets oldTime to 10:49:11

	System.out.println(t1.toUniversalString());
	System.out.println(t1.toStandardString());
	
    }
}
