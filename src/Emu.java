// First (and only) Concrete Class on FlyingBird side
class Emu extends FlightlessBird {

    /**
     * Design decision: constructor Emu() is added to the Emu class.
     * It allows to set the attribute "name of bird" to the corresponding Bird instance.
     * It also calls the toString() method from the superclass to print the bird's information.
     */
    Emu() {
        // Initial call: super(); method
        setName("Emu");
        System.out.println(toString());
    }

    // Overriding the superclass method sing()
    @Override
    void sing() {
        System.out.println(getName() + " sings: Coo Koo, I'm an E-M-uh");
    }
}