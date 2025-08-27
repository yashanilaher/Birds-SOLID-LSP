package com.yash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BirdTest {
    @Test
    public void testSparrowProperties(){
        Sparrow sp=new Sparrow("Pegion",2);
        assertEquals("Pegion",sp.getName());
        assertEquals(2,sp.getLegs());
    }

    @Test
    public void testPenguinProperties(){
        Penguine pg=new Penguine("Ostrich",2);
        assertEquals("Ostrich",pg.getName());
        assertEquals(2,pg.getLegs());
    }

    @Test
    public void testSparrowCanFly(){
        Flyable sp=new Sparrow("Pegion",2);
        assertDoesNotThrow(() -> sp.fly());
    }

    @Test
    public void testPenguinIsNotFlyable(){
        Bird pg=new Penguine("Ostrich",2);
        assertFalse(pg instanceof Flyable);
    }
}
