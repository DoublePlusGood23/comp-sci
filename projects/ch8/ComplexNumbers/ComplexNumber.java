/*
  Ethan R. Jones
  2-11-2014
  Complex Numbers
*/
public class ComplexNumber
{
    private float realPart;
    private float imaginaryPart;

    // Default Constructor
    public ComplexNumber()
    {
	realPart = 0;
	imaginaryPart = 0;
    }

    // Constructor that takes input
    public ComplexNumber(float realPart, float imaginaryPart)
    {
	setrealPart(realPart);
	setimaginaryPart(imaginaryPart);
    }

    // Set methods
    public void setrealPart(float realPart)
    {
	this.realPart = realPart;
    }

    public void setimaginaryPart(float imaginaryPart)
    {
	this.imaginaryPart = imaginaryPart;
    }

    // Mutators
    public float getrealPart()
    {
	return realPart;
    }

    public float getimaginaryPart()
    {
	return imaginaryPart;
    }

    // Functional stuff
    public ComplexNumber add(ComplexNumber left, ComplexNumber right)
    {
	this.realPart = left.getrealPart() + right.getrealPart();
	this.imaginaryPart = left.getimaginaryPart() + right.getimaginaryPart();

	return this;
    }

    public String toString()
    {
	return "" + realPart + "+" + imaginaryPart + "i";
    }
    
}
