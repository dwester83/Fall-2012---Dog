package dog;

/**
 *
 * @author Chris Sadler
 * @author Daniel Wester
 * @author Brian Hanson
 */
public class BigDog extends Dog{
    public BigDog(String name, int age)
    {
        super(name, age);
    }
    
    public String bark()
    {
        return "Woof woof";
    }
    
    public String toString()
    {
        return super.toString() + "  This is a big dog.";
    }
    
    public boolean equals(Object bigDog) {
    	if (bigDog instanceof BigDog) {
            Dog otherDog = (BigDog)bigDog;
            return (otherDog.canEqual(this) && super.equals(otherDog));
        }
        else {return false;}
    }
    
    public boolean canEqual(Object object)
    {
        return (object instanceof BigDog);
    }
}
