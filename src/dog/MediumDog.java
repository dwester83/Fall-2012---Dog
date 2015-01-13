package dog;

/**
 *
 * @author Chris Sadler
 * @author Daniel Wester
 * @author Brian Hanson
 */
public class MediumDog extends Dog{
    public MediumDog(String name, int age)
    {
        super(name, age);
    }
    
    public String bark()
    {
        return "Arf arf";
    }
    
    public String toString()
    {
        return super.toString() + "  This is a medium dog.";
    }
    
    public boolean equals(Object mediumDog) {
    	if (mediumDog instanceof MediumDog) {
            Dog otherDog = (MediumDog)mediumDog;
            return (otherDog.canEqual(this) && super.equals(otherDog));
        }
        else {return false;}
    }
    
    public boolean canEqual(Object object)
    {
        return (object instanceof MediumDog);
    }
}
