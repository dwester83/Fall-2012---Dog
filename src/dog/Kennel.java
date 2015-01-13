package dog;

/**
 *
 * @author Chris Sadler
 * @author Daniel Wester
 * @author Brian Hanson
 */
public class Kennel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog kennel[] = new Dog[7];
        try{
            System.out.println("Creating new Dog \"Butch\" who is 3 years"
                    + " old.");
            kennel[0] = new Dog("Butch", 3);
            System.out.println("Creating new SmallDog \"Peanut\" who is 5"
                    + " years old.");
            kennel[1] = new SmallDog("Peanut", 5);
            System.out.println("Creating new MediumDog \"Lulu\" who is 2 "
                    + "years old.");
            kennel[2] = new MediumDog("Lulu", 2);
            System.out.println("Creating new BigDog \"Ace\" who is 6 years"
                    + " old.");
            kennel[3] = new BigDog("Ace", 6);
            System.out.println("Creating new MediumDog \"Peter\" who is 1 "
                    + "year old.");
            kennel[4] = new MediumDog("Peter", 1);
            System.out.println("Creating new SmallDog \"Justice\" who is 0 "
                    + "years old.");
            kennel[5] = new SmallDog("Justice", 0);
            System.out.println("Creating new Dog \"Dog\" who is -5 years "
                    + "old.");
            kennel[6] = new Dog("Dog", -5);
            
        }catch(InvalidDogException ide){
            System.out.println("Caught exception: " + ide.getMessage());
        }
        
        System.out.println("Creating new Dog \"Dog\" who is 5 years old.");
        kennel[6] = new Dog("Dog", 5);
        
        System.out.println("\nTesting toString output:\n");
        
        for(int i = 0; i < kennel.length; i++)
        {
            System.out.println(kennel[i]);
            System.out.println(kennel[i].bark() + "\n");
        }
        
        try{
            System.out.println("Changing age of BigDog " +
                    kennel[3].getName() + " to -1000");
            kennel[3].setAge(-1000);
            System.out.println("New age: " + kennel[3].getAge());
            System.out.println("Uh oh, this should not have been"
                    + " successful...");
        }catch(InvalidDogException ide){
            System.out.println("Caught exception: " + ide.getMessage());
        }
        
        try{
            System.out.println("Changing name of SmallDog " +
                    kennel[5].getName() + " to Batman");
            kennel[5].setName("Batman");
            System.out.println("New name: " + kennel[5].getName());
        }catch(InvalidDogException ide){
            System.out.println("Uh oh, there should not be any "
                    + "exceptions thrown...");
            System.out.println("Caught exception: " + ide.getMessage());
        }
        
        System.out.println("\nTesting equals() method:\n");
        
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                System.out.println("Does " + kennel[i].getName() + " equal "
                        + kennel[j].getName() + "?");
                System.out.println(kennel[i].equals(kennel[j]));
            }
        }
        
        System.out.println("\nChanging SmallDog " + kennel[1].getName() +
                " to match BigDog " + kennel[3].getName());
        kennel[1].setAge(kennel[3].getAge());
        kennel[1].setName(kennel[3].getName());
        
        System.out.println("\nDoes SmallDog " + kennel[1].getName() +
                " equal BigDog " + kennel[3].getName() + "?");
        System.out.println(kennel[1].equals(kennel[3]));
        System.out.println("\nDoes BigDog " + kennel[3].getName() +
                " equal SmallDog " + kennel[1].getName() + "?");
        System.out.println(kennel[3].equals(kennel[1]));
        
        System.out.println("\nChanging SmallDog " + kennel[1].getName() +
                " to match MediumDog " + kennel[2].getName());
        kennel[1].setAge(kennel[2].getAge());
        kennel[1].setName(kennel[2].getName());
        
        System.out.println("\nDoes SmallDog " + kennel[1].getName() +
                " equal MediumDog " + kennel[2].getName() + "?");
        System.out.println(kennel[1].equals(kennel[2]));
        System.out.println("\nDoes MediumDog " + kennel[2].getName() +
                " equal SmallDog " + kennel[1].getName() + "?");
        System.out.println(kennel[2].equals(kennel[1]));
        
        System.out.println("\nChanging SmallDog " + kennel[1].getName() +
                " to match Dog " + kennel[0].getName());
        kennel[1].setAge(kennel[0].getAge());
        kennel[1].setName(kennel[0].getName());
        
        System.out.println("\nDoes SmallDog " + kennel[1].getName() +
                " equal Dog " + kennel[0].getName() + "?");
        System.out.println(kennel[1].equals(kennel[0]));
        System.out.println("\nDoes Dog " + kennel[0].getName() +
                " equal SmallDog " + kennel[1].getName() + "?");
        System.out.println(kennel[0].equals(kennel[1]));
        
        System.out.println("\nChanging SmallDog " + kennel[1].getName() +
                " to match SmallDog " + kennel[5].getName());
        kennel[1].setAge(kennel[5].getAge());
        kennel[1].setName(kennel[5].getName());
        
        System.out.println("\nDoes SmallDog " + kennel[1].getName() +
                " equal SmallDog " + kennel[5].getName() + "?");
        System.out.println(kennel[1].equals(kennel[5]));
        System.out.println("\nDoes SmallDog " + kennel[5].getName() +
                " equal SmallDog " + kennel[1].getName() + "?");
        System.out.println(kennel[5].equals(kennel[1]));
    }
}
