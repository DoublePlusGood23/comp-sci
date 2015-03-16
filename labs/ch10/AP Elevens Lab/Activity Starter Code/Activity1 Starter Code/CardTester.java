/**
 * This is a class that tests the Card class.
 */
public class CardTester
{

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args)
    {
	Card aceClubs1 = new Card("ace", "clubs", 1);
	Card aceClubs2 = new Card("ace", "clubs", 1);
	Card sixHearts = new Card("6", "hearts", 6);

	System.out.println("**** ace of clubs *****");
	System.out.println("  rank: " + aceClubs1.rank());
	System.out.println("  suit: " + aceClubs1.suit());
	System.out.println("  pointValue: " + aceClubs1.pointValue());
	System.out.println("\n**** clubs2 ****");
	System.out.println("  rank: " + aceClubs2.rank());
	System.out.println("  suit: " + aceClubs2.suit());
	System.out.println("  pointValue: " + aceClubs2.pointValue());
    }
}
