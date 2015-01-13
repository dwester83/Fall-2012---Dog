package dog;

/**
 *
 * @author Chris Sadler
 * @author Daniel Wester
 * @author Brian Hanson
 */
public class SmallDog extends Dog{
    public SmallDog(String name, int age)
    {
        super(name, age);
    }
    
    public String bark()
    {
        return "Yip yip";
    }
    
    public String toString()
    {
        return super.toString() + "  This is a small dog.";
    }
    
    public boolean equals(Object smallDog) {
    	if (smallDog instanceof SmallDog) {
            Dog otherDog = (SmallDog)smallDog;
            return (otherDog.canEqual(this) && super.equals(otherDog));
        }
        else {return false;}
    }
    
    public boolean canEqual(Object object)
    {
        return (object instanceof SmallDog);
    }
}
