package com.yash;

/**
 * Represents a Sparrow which is a Flyable bird.
 */

public class Sparrow extends Flyablebird {

    /**
     * Constructor for Sparrow.
     *
     * @param bname the name of the sparrow
     * @param blegs the number of legs
     */
    public Sparrow(final String bname, final int blegs) {
        super(bname, blegs);
    }

    /**
     * Makes the sparrow fly, tells can sparrow fly.
     */
    @Override
    public void fly() {
        System.out.println(getName() + " flies");
    }



}
