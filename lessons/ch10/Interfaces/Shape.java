// Fig. 10.18: Shape.java
// Shape interface declaration

// Interfaces are like abstract classes, but used when the superclass
//  doesn't have any default implementations - only used to inherit

// In other words, there are no variables to a "shape"

// Therefore the three methods in here are abstract by default
//  and will be created in any subsequent subclasses

public interface Shape
{    
    public double getArea();    // calculate area
    public double getVolume();  // calculate volume
    public String getName();    // return shape name  
}
