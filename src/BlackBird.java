// First (and only) Concrete Class on FlyingBird side
class BlackBird extends FlyingBird {

    /**
     * Design decision: constructor BlackBird() is added to the BlackBird class.
     * It allows to set the attribute "name of bird" to the corresponding Bird instance.
     * It also calls the toString() method from the superclass to print the bird's information.
     */
    BlackBird() {
        // Initial call: super(); method
        setName("BlackBird");
        System.out.println(toString());
    }

    // Overriding the Bird superclass method sing()
    @Override
    void sing() {
        System.out.println(getName() + " sings: ChirpChirp I'm a Blackbird");
    }

    // Overriding the Flyable interface method flys()
    @Override
    public boolean flys() {
        return true;
    }
}