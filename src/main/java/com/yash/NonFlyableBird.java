package com.yash;

/**
 * Represents a non-flyable bird.
 * This class avoids implementing fly() to comply with LSP.
 */
public abstract class NonFlyableBird extends Bird {

    /**
     * Constructor for NonFlyableBird.
     *
     * @param bname the name of the bird
     * @param blegs the number of legs
     */
    public NonFlyableBird(final String bname, final int blegs) {
        super(bname, blegs);
    }

     //Here we can see fly() function not provided , so avoids violating LSP

}
