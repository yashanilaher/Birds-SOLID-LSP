package com.yash;

/**
 * Represents a Penguin which is a non-flyable bird.
 */
public class Penguine extends NonFlyableBird {

    /**
     * Constructor for Penguine.
     *
     * @param bname the name of the penguin
     * @param blegs the number of legs of the penguin
     */
    public Penguine(final String bname, final int blegs) {
        super(bname, blegs);
    }

    // No fly() method because Penguin cannot fly (complies with LSP)



}
