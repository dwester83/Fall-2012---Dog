package dog;

/**
 *
 * @author Chris Sadler
 * @author Daniel Wester
 * @author Brian Hanson
 */
public class Dog {
    private String name;
    private int age;
    
    public Dog(String name, int age)
    {
        this.name = name;
        
        setAge(age); // Validate!
    }
    
    public void setAge(int age)
    {
        if (age < 0)
        {
            throw new InvalidDogException("Age not valid.");
        }
        else
        {
            this.age = age;
        }
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String bark()
    {
        return "Bow wow";
    }
    
    public int humanYears()
    {
        return age * 7;
    }
    
    public String toString()
    {
        return (name + " is " + age + " year" + ((age == 1)? " ": "s ") + "old"
                + ".  In human years this would be " + humanYears() + ".");
    }
    
    public boolean equals(Object dog) {
    	if (dog instanceof Dog) {
            Dog otherDog = (Dog)dog;
            return (otherDog.canEqual(this) &&
                    otherDog.getName().equals(this.name) &&
                    otherDog.getAge()==(this.age));
        }
        else {return false;}
    }
    
    public boolean canEqual(Object object)
    {
        return (object instanceof Dog);
    }
}
