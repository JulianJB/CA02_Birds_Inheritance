// The FlightlessBird class is now abstract, therefore, instances of this
// class are not longer possible.
abstract class FlightlessBird extends Bird {

    // FlightlessBird constructor changed to only set the value of the
    // attribute "type of bird" once an instance of a Bird has been created.
    FlightlessBird() {
        setType("FlightlessBird");
    }

    /**
     * Design decision: method void sing() is removed from FlightlessBird class.
     * Since the FlightlessBird class is now an abstract class it is not longer required
     * to implement the abstract method sing() from its superclass Bird.
     * Likewise, since FlightlessBird is an abstract class it won't be possible to create
     * instances from the FlightlessBird class so the local method sing() won't be used.
     */
}