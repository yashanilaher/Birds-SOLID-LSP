package com.yash;

/**
 * Abstract class representing a bird that can fly.
 */
public abstract class Flyablebird extends Bird implements Flyable {

    /**
     * Constructs a FlyableBird with the given name and number of legs.
     *
     * @param bname the name of the bird
     * @param blegs the number of legs of the bird
     */
    public Flyablebird(final String bname, final int blegs) {
        super(bname, blegs);
    }
}
