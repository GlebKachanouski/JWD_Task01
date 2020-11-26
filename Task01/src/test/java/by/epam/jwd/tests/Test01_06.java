package by.epam.jwd.tests;

import by.epam.jwd.task01_06.Task01_06;
import org.junit.Assert;
import org.junit.Test;

public class Test01_06 {
    @Test
    public void Test6(){
        Assert.assertEquals("13:53:20", new Task01_06().HoursTaken(50000));
        Assert.assertEquals("23:47:11", new Task01_06().HoursTaken(85631));
        Assert.assertEquals("18:19:59", new Task01_06().HoursTaken(65999));
    }
}
