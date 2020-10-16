// The Bird class is now abstract, therefore, instances of this
// class are not longer possible.
abstract class Bird {
    // Kept added attributes "name" and "type" from the original
    // code that are not included in the Whiteboard design as they
    // were found appropriate for this example.
    String name;		// note all subclasses can inherit
    String type;		// these
    boolean canSing;

    Bird() {
        System.out.print("JVM making a Bird() - ");
        // By default all inheriting Birds will sing
        canSing = true; // Set boolean value to true
    }

    // The sing() method is now abstract, therefore, it will
    // have to be implemented by all of the subclasses.
    abstract void sing();

    boolean sings() {
        return canSing;
    }

    /**
     * Design decision: method String getName() is added to the Bird class.
     * An accessor method (getter) to retrieve the name of a bird, it is preferred
     * over using a direct access to the attribute name from the subclasses (Java convention).
     */
    String getName() {
        return name;
    }

    /**
     * Design decision: method void setName() is added to the Bird class.
     * A mutator method (setter) to assign the name of a bird, it is preferred
     * over using a direct access to the attribute name from the subclasses (Java convention).
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * Design decision: method String getType() is added to the Bird class.
     * An accessor method (getter) to retrieve the type of a bird, it is preferred
     * over using a direct access to the attribute type from the subclasses (Java convention).
     */
    String getType() {
        return type;
    }

    /**
     * Design decision: method void setType() is added to the Bird class.
     * A mutator method (setter) to assign the type of a bird, it is preferred
     * over using a direct access to the attribute type from the subclasses (Java convention).
     */
    void setType(String type) {
        this.type = type;
    }

    /**
     * Design decision: method String toString() is added to the Bird class.
     * It allows to print the information from the bird (name and type) and
     * is accessible from all of the subclasses, thus, reusing code and reducing
     * the number of System.out.print() statements.
     */
    @Override
    public String toString() {
        return "Name: " + getName() + " Type: " + getType();
    }
}