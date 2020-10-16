import java.util.ArrayList;
import java.util.List;

/*
 *	This is a main class, which intends to create an array of type
 *	Bird {abstract}, and populate it randomly with the concrete types:
 *		BlackBird or Emu
 *	after which, a call to sing() is made. Depending on the concrete
 *	object type, a differing sing() implementation should execute.
 */
class BirdMaker {

    public static void main(String[] args) {
        /** Implementation 1: Using arrays for the Bird instances */
        Bird[] birds = new Bird[6]; // new empty Bird[]

        for(int i = 0; i < birds.length; i++) {
            // Code to randomly fill birds[i] with either a BlackBird or an Emu
            // This will produce a random number of type double between 0 and 1,
            // then it will round it to the nearest value and cast it to an integer value.
            int randomNumber = (int) Math.round(Math.random());
            // Value 0 for BlackBirds
            if (randomNumber == 0) {
                birds[i] = new BlackBird();
            } else { // Value 1 for Emus
                birds[i] = new Emu();
            }
            // Call to the sings() method of the superclass
            System.out.println(birds[i].getName() + " can sing?: " + birds[i].sings());
            // A polymorphic call to the sing() method
            birds[i].sing();
            if (birds[i] instanceof FlyingBird) {
                // Downcast a Bird object to a FlyingBird object
                System.out.println(birds[i].getName() + " can fly?: " + ((FlyingBird) birds[i]).flys());
            }
        }

        /** Implementation 2: Using any List implementation for the Bird instances
         * Note: Only code repeated here for simplicity of the implementation
         * (don't need to create additional methods for the main class) */
        System.out.println("--------------------------------------");

        List<Bird> birdsList = new ArrayList<Bird>();
        // Code to randomly fill birdsList with either a BlackBird or an Emu
        int aRandomNumber = (int) Math.round(Math.random());
        // Value 0 for BlackBirds
        if (aRandomNumber == 0) {
            birdsList.add(new BlackBird());
        } else { // Value 1 for Emus
            birdsList.add(new Emu());
        }
        for (Bird bird : birdsList) {
            // Call to the sings() method of the superclass
            System.out.println(bird.getName() + " can sing?: " + bird.sings());
            // A polymorphic call to the sing() method
            bird.sing();
            if (bird instanceof FlyingBird) {
                // Downcast a Bird object to a FlyingBird object
                System.out.println(bird.getName() + " can fly?: " + ((FlyingBird) bird).flys());
            }
        }
    }
}