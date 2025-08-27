package com.yash;

/**
 * Abstract class representing a Bird.
 * Subclasses should extend this to define specific bird types.
 */

public abstract class Bird {
    /** name of bird. */
    private String name;

    /** no of legs of bird. */
    private int legs;

    /**
     * Constructs a Bird with the given name and number of legs.
     * @param bname the name of the bird
     * @param blegs the number of legs of the bird
     */
    public Bird(final String bname, final int blegs) {
        this.name = bname;
        this.legs = blegs;
    }

    /**
     * Gets the name of the bird.
     * Subclasses may override if they need a custom naming convention.
     *
     * @return the bird's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the number of legs of the bird.
     * Subclasses may override if legs are determined dynamically.
     *
     * @return the bird's number of legs
     */
    public int getLegs() {
        return legs;
    }
}



