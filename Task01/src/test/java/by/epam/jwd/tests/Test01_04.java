package by.epam.jwd.tests;

import by.epam.jwd.task01_04.Task01_04;
import org.junit.Assert;
import org.junit.Test;

public class Test01_04 {
    @Test
    public void Test4(){
        Assert.assertTrue(new Task01_04().HasEvenNumbered(new int[] {1,2,3,4}));
        Assert.assertFalse(new Task01_04().HasEvenNumbered(new int[] {1,1,1,1}));
        Assert.assertTrue(new Task01_04().HasEvenNumbered(new int[] {6,2,6,4}));
    }
}
