// The FlyingBird class is now abstract, therefore, instances of this
// class are not longer possible.
abstract class FlyingBird extends Bird implements Flyable {
    // FlyingBird constructor changed to only set the value of the
    // attribute "type of bird" once an instance of a Bird has been created.
    FlyingBird() {
        // Initial call: super() method;
        setType("FlyingBird");
    }

    /**
     * Design decision: method void sing() and boolean flys() are removed from FlyingBird class.
     * Since the FlyingBird class is now an abstract class it is not longer required
     * to implement the abstract method sing() from its superclass Bird nor the method flys()
     * from the Flyable interface.
     * Likewise, since FlyingBird is an abstract class it would not be possible to create
     * instances from the FlyingBird class so the local methods sing() and flys() won't be used.
     */
}