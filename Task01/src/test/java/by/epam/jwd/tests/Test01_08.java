package by.epam.jwd.tests;

import by.epam.jwd.task01_08.Task01_08;
import org.junit.Assert;
import org.junit.Test;

public class Test01_08 {
    @Test
    public void Test8(){
        Assert.assertEquals(0.5, new Task01_08().NumberCheck(2), 1);
        Assert.assertEquals(-79, new Task01_08().NumberCheck(7), 1);
        Assert.assertEquals(-163, new Task01_08().NumberCheck(11), 1);
    }
}
