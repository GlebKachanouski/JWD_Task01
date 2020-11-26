package by.epam.jwd.tests;

import by.epam.jwd.task01_05.Task01_05;
import org.junit.Assert;
import org.junit.Test;

public class Test01_05 {
    @Test
    public void Test5() {
        Assert.assertTrue(new Task01_05().IsPerfect(6));
        Assert.assertFalse(new Task01_05().IsPerfect(9));
        Assert.assertTrue(new Task01_05().IsPerfect(8128));
    }
}
